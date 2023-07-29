package Seminar_5.Task1;

public class calculator_Main {
    public static void main(String[] args) {

        Calculator_Model model = new Calculator_Model(); // Создаем новый обьект класса
        Calculator_View view = new Calculator_View();
        Calculator_Controller controller = new Calculator_Controller(model, view);

        String operation = view.getOperation();
        int num1 = view.getOperand();
        int num2 = view.getOperand();
        
        controller.perfomeOperation(operation, num1, num2);

    }

}
