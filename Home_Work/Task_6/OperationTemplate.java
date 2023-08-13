package Home_Work.Task_6;

// Принцип открытости-закрытости(Open-closed principle), был создан 
// интерфейс OperationTemplate для предоставления отдельной операции и 
// создаим классы для реализации каждой операции: OperationSumm, 
// OperationSubstract, OperationMultiply, OperationDivide. 
// Данная механика может повзволит добавлять новые операции без изменения 
// уже существующего кода.

public interface OperationTemplate {
    int performOperation(int num1, int num2);
}
