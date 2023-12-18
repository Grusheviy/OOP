package View;

import java.util.Scanner;

public class ConsoleView {
    private final Scanner scanner;

    public ConsoleView(Scanner scanner) {
        this.scanner = scanner;
    }

    public double getDoubleInput(String prompt) {
        System.out.print(prompt + ": ");
        return scanner.nextDouble();
    }

    public void displayResult(double result) {
        System.out.printf("Результат: %.2f%n", result);
    }

    public void displayErrorMessage(String message) {
        System.out.println("Ошибка: " + message);
    }

}
