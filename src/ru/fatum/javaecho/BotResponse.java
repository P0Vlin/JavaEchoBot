package ru.fatum.javaecho;

public class BotResponse {
    private String responseText;

    public BotResponse(String responseText) {
        this.responseText = responseText;
    }

    public String getResponseText() {
        return responseText;
    }
}