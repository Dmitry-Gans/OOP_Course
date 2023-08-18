package Home_Work.Task_6;

import java.util.logging.Logger;

public class OperationSumm implements OperationTemplate {
    private static final Logger LOGGER = Logger.getLogger(OperationTemplate.class.getName());

    @Override
    public int performOperation(int num1, int num2) {
        LOGGER.info("Выполняется операция сложения!");
        int result = num1 + num2;
        LOGGER.info("Результат: " + result);
        return result;
    }
}
