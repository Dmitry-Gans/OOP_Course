package Home_Work.Task_5.Optionally;

import java.util.ArrayList;
import java.util.Objects;
import java.util.Scanner;

public class UserView {

    private Scanner scanner;
    private ArrayList<String> list = new ArrayList<>();

    public String getRegisterAccount() {
        scanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите данные:");
        String input = scanner.next();
        list.add(input);
        return input;
    }

    public String getlogIn() {
        scanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите данные:");
        String input = scanner.next();
        if (list.contains(input)) {
            return input;
        } else {
            throw new IllegalArgumentException("Такого пользователя нет, зарегестрируйтесь");
        }
    }

    public String getChangePassword() {
        scanner = new Scanner(System.in, "Cp866");
        System.out.println("Введите старый пароль:");
        String input = scanner.next();
        if (list.contains(input)) {
            int index = list.indexOf(input);
            System.out.println("Введите новый пароль:");
            String newInput = scanner.next();
            if (index != -1) {
                list.set(index, newInput);
            }
            return newInput;
        } else {
            throw new IllegalArgumentException("Пароль введен не правильно!");
        }
    }

    public void displayResult(String userData) {
        System.out.println("Данные пользователя: " + userData);
    }

    public void displayLogIn(String name) {
        System.out.println("Добро пожаловать: " + name);
    }

    public void displayPassvord(String name, String passvord) {
        System.out.println(name + ", ваш новый пароль: " + passvord);
    }
}
