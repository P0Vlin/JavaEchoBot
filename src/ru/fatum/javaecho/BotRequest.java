package ru.fatum.javaecho;

public class BotRequest {
    private String requestText;

    public BotRequest(String requestText) {
        this.requestText = requestText;
    }

    public String getRequestText() {
        return requestText;
    }
}