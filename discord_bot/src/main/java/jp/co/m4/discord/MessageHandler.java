package jp.co.m4.discord;

import discord4j.core.object.entity.Message;

public interface MessageHandler {
    String onMessage(Message message);
}
