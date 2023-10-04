package ru.fatum.javaecho;

import java.util.Scanner;

public class ConsoleInputReader implements InputReader {
    private Scanner scanner;

    public ConsoleInputReader() {
        scanner = new Scanner(System.in);
    }

    @Override
    public BotRequest getUserInput() {
        System.out.print("User: ");
        String userInput = scanner.nextLine();
        return new BotRequest(userInput);
    }
}