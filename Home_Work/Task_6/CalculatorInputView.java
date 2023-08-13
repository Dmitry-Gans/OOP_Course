package Home_Work.Task_6;

// Принцип единой ответственности(Single responsibility principle), 
// класс Calculator был разделён на 2 класса: CalculatorInputVeiw и 
// CalculatorOutput, в первом классе будет происходить только получение 
// данных от пользователя, а второй же класс отвечает только за вывод 
// результатов.

import java.util.Scanner;

public class CalculatorInputView {
    private Scanner scanner;

    public CalculatorInputView() {
        scanner = new Scanner(System.in);
    }

    public String getOperation() {
        System.out.println("Введите операцию: (+,-,*,/)");
        return scanner.nextLine();
    }

    public int getOperand() {
        System.out.println("Введите число: ");
        return Integer.parseInt(scanner.nextLine());
    }
}
