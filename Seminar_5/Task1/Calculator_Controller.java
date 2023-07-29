package Seminar_5.Task1;

public class Calculator_Controller {

    private Calculator_View view;
    private Calculator_Model model;

    public Calculator_Controller(Calculator_Model model, Calculator_View view) {

        this.model = model; // Обращаемся к полям самого класса, а не конструктора в аргументах
        this.view = view;

    }

    public void perfomeOperation(String operation, int num1, int num2) {

        switch(operation) {
            case "+":
                model.add(num1, num2);
                break;
            case "-":
                model.subtract(num1, num2);
                break;
            case "*":
                model.multiply(num1, num2);
                break;
            case "/":
                model.divide(num1, num2);
                break;
            default:
                System.out.println("Некорректная операция!");
        }

        view.displayResult(model.getResult());
        
    }
}
