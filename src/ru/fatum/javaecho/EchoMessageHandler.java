package ru.fatum.javaecho;

public class EchoMessageHandler implements MessageHandler {
    @Override
    public void handle(BotRequest request, AnswerWriter writer) {
        String userMessage = request.getRequestText();
        BotResponse response = new BotResponse(userMessage);
        writer.writeAnswer(response);
    }
}