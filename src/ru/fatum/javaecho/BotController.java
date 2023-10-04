package ru.fatum.javaecho;

public class BotController {
    private InputReader inputReader;
    private AnswerWriter answerWriter;
    private MessageHandler messageHandler;

    public BotController(InputReader inputReader, AnswerWriter answerWriter, MessageHandler messageHandler) {
        this.inputReader = inputReader;
        this.answerWriter = answerWriter;
        this.messageHandler = messageHandler;
    }

    public void start() {
        while (true) {
            BotRequest request = inputReader.getUserInput();
            messageHandler.handle(request, answerWriter);
        }
    }
}