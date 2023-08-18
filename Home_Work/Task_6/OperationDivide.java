package Home_Work.Task_6;
import java.util.logging.Logger;

public class OperationDivide implements OperationTemplate {
    private static final Logger LOGGER = Logger.getLogger(OperationDivide.class.getName());
    @Override
    public int performOperation(int num1, int num2) {
        LOGGER.info("Выполняется операция деления!");

        if (num2 != 0) {
            int result = num1 / num2;
            LOGGER.info("Результат: " + result);
            return result;
        } else {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
    }
}
