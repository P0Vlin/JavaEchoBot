package ru.fatum.javaecho;

public class ConsoleAnswerWriter implements AnswerWriter {
    @Override
    public void writeAnswer(BotResponse response) {
        System.out.println("Bot: " + response.getResponseText());
    }
}