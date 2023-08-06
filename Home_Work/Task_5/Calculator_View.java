package Home_Work.Task_5;

import java.util.Scanner;

public class Calculator_View {

    private Scanner scanner;

    public void displayResult(int result) {
        System.out.println("Результат: " + result);
    }

    public void displayDoubleResult(String result) {
        System.out.println("Результат: " + result);
    }
    
    public Integer getUserInput() {
        scanner = new Scanner(System.in);
        System.out.println("Введите число: ");
        int input = scanner.nextInt();
        return input;
    }
}
