package Home_Work.Task_6;

// Принцип разделения интерфейса(Interface segregation principle), 
// при улучшении кода уже был выполнен принцип разделения интерфейса 
// путем создания отдельных интерфейсов для операций OperationTemplate 
// и визуализации CalculatorOutputView, таким образом пользователь будет 
// работать только те методы, которые ему необходимы, что улучшает код 
// и позволяет лучше поддерживать и расширять его в будущем.

public class CalculatorOutputView {
    public void displayResult(int result) {
        System.out.println("Результат: " + result);
    }
}
