package jp.co.m4.discord;

import discord4j.core.DiscordClient;
import discord4j.core.GatewayDiscordClient;
import discord4j.core.event.domain.message.MessageCreateEvent;
import discord4j.core.object.entity.Message;
import discord4j.core.object.entity.User;
import discord4j.core.object.entity.channel.MessageChannel;

public class DiscordBot {

    private final GatewayDiscordClient gatewayDiscordClient;

    public DiscordBot(String token) {
        DiscordClient client = DiscordClient.create(token);

        gatewayDiscordClient = client.login().block();

        if (gatewayDiscordClient != null) {
            User bot = gatewayDiscordClient.getSelf().block();
            System.out.println("Logged in as: " + bot.getUsername());
        }
    }

    public void setMessageHandler(MessageHandler messageHandler) {
        gatewayDiscordClient.on(MessageCreateEvent.class).subscribe(event -> {
            final Message message = event.getMessage();
            final String reply = messageHandler.onMessage(message);
            if (reply != null) {
                MessageChannel channel = message.getChannel().block();
                channel.createMessage(reply).block();
            }
        });
    }

    public void waitMessages() {
        try {
            gatewayDiscordClient.onDisconnect().block();
        } finally {
            gatewayDiscordClient.logout().block();
        }
    }
}
