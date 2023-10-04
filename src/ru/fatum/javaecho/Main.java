package ru.fatum.javaecho;

public class Main {
    public static void main(String[] args) {
        InputReader inputReader = new ConsoleInputReader();
        AnswerWriter answerWriter = new ConsoleAnswerWriter();
        MessageHandler messageHandler = new EchoMessageHandler();

        BotController botController = new BotController(inputReader, answerWriter, messageHandler);
        botController.start();
    }
}