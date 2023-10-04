package ru.fatum.javaecho;

public interface MessageHandler {
    void handle(BotRequest request, AnswerWriter writer);
}