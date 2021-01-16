package jp.co.m4.discord;

public class Main {

    private final DiscordBot bot;

    private final MessageHandler messageHandler = new MessageHandlerImpl();

    public Main(String token) {
        bot = new DiscordBot(token);
        bot.setMessageHandler(messageHandler);

        bot.waitMessages();
    }

    public static void main(String[] args) {
        String token = args[0];
        new Main(token);
    }
}
