import Controller.Calculator;
import Model.*;

import java.util.Scanner;
import View.ConsoleView;

public class Main {
    public static void main(String[] args) {
//        //Вызываем сложение и создаем переменную для его результата
//        Calculator calculator = new Calculator(new Addition());
//        double additionResult = calculator.calculate(5, 5);
//
//        //Вызываем вычитание и создаем переменную для его результата
//        Calculator calculator1 = new Calculator(new Subtraction());
//        double subtractionResult = calculator1.calculate(4, 5);
//
//        //Вызываем умножение и создаем переменную для его результата
//        Calculator calculator2 = new Calculator(new Multiplication());
//        double multiplicationResult = calculator1.calculate(5, 5);
//
//        //Вызываем деление и создаем переменную для его результата
//        Calculator calculator3 = new Calculator(new Division());
//        double divisionResult = calculator2.calculate(5, 2);
//
//        //Вызываем деление, создаем переменную для его результата
//        //и проверяем что корректно отрабатывает брейкпоинт деления на ноль
//        Calculator calculator4 = new Calculator(new Division());
//        double divisionOnZero = calculator3.calculate(5, 0);
//    }
//}

//         Так же можно реализовать выбор операций с консоли

        Scanner scanner = new Scanner(System.in);
        ConsoleView consoleView = new ConsoleView(scanner);

        System.out.println("Выберите операцию:");
        System.out.println("1. Сложение");
        System.out.println("2. Вычитание");
        System.out.println("3. Умножение");
        System.out.println("4. Деление");

        int choise = scanner.nextInt();
        Calculate calculate;
        switch (choise){
            case 1:
                calculate = new Addition();
                break;
            case 2:
                calculate = new Subtraction();
                break;
            case 3:
                calculate = new Multiplication();
                break;
            case 4:
                calculate = new Division();
                break;
            default:
                System.out.println("Некорректна выбрана операция");
                return;
        }
        double x = consoleView.getDoubleInput("Введите первое число");
        double y = consoleView.getDoubleInput("Введите второе число");

        Calculator calculator5 = new Calculator(calculate);
        double result = calculator5.calculate(x, y);
        consoleView.displayResult(result);
    }
}