package Seminar_5.Task1;

import java.util.Scanner;

public class Calculator_View {

    private Scanner scanner;

    public Calculator_View() {
        scanner = new Scanner(System.in);
    }
    
    public void displayResult(int result) {
        System.out.println("Результат: " + result);
    }

    public String getOperation() {
        System.out.println("Введите операцию: (+, -, *, /)");
        return scanner.nextLine();
    }

    public int getOperand() {
        System.out.println("Введите число: ");
        return Integer.parseInt(scanner.nextLine()); // Метод scaner считывает 
        // веденую строку, и преобразуем ее в число через Integer.parseInt
    }
}
