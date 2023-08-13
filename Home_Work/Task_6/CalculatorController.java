package Home_Work.Task_6;

// Принцип инверсии зависимостей(Dependency inversion principle),
// в классе CalculatorController происходит инвертирование зависимостей 
// от классов CalculatorModel и CalculatorOutputView. Вместо того чтобы 
// создавать их экземпляры внутри CalculatorController, мы должны 
// передавать их через конструктор.

public class CalculatorController {
    private CalculatorModel model;
    private CalculatorOutputView view;

    public CalculatorController(CalculatorModel model, CalculatorOutputView view) {
        this.model = model;
        this.view = view;
    }

    public void performOperation(String operation, int num1, int num2) {
        switch (operation) {
            case "+":
                model.setOperationStrategy(new OperationSumm());
                break;
            case "-":
                model.setOperationStrategy(new OperationSubtract());
                break;
            case "*":
                model.setOperationStrategy(new OperationMultiply());
                break;
            case "/":
                model.setOperationStrategy(new OperationDivide());
                break;
            default:
                System.out.println("Некорректная операция!");
        }
        model.performOperation(num1, num2);
        view.displayResult(model.getResult());
    }
}
