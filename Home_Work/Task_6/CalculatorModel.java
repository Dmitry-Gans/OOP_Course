package Home_Work.Task_6;

// Принцип подстановки Лисков(Liskov substitution principle), 
// тот же интерфейс OperationTemplate позволяет без добавления 
// конкретных классов, без изменения кода в классе CalculatorModel. 
// Из - за этого класс CalculatorModel может принимать любую реализацию 
// интерфейса OperationTemplate.

public class CalculatorModel {
    private int result;
    private OperationTemplate operation;

    public void setOperationStrategy(OperationTemplate operation) {
        this.operation = operation;
    }

    public void performOperation(int num1, int num2) {
        result = operation.performOperation(num1, num2);
    }

    public int getResult() {
        return result;
    }
}
