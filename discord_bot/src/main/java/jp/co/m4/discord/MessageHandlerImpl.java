package jp.co.m4.discord;

import discord4j.core.object.entity.Message;

public class MessageHandlerImpl implements MessageHandler {

    @Override
    public String onMessage(Message message) {
        String msg = message.getContent();
        if (msg.startsWith("!hello")) {
            return "Hi there!";
        }


        return null;
    }
}