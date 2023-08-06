package Home_Work.Task_5;

import java.text.DecimalFormat;

public class Calculator_Model {

    private int result;
    private double result2;
    
    public void summ(int num1, int num2) {
        result = num1 + num2;
    }

    public void subtract(int num1, int num2) {
        result = num1 - num2;
    }
    
    public void divide (int num1, double num2) {
        if(num2 != 0) {
           result2 = num1 / num2; 
        } else {
            throw new IllegalArgumentException("На ноль делить нельзя!");
        }
    }

    public void multiply(int num1, int num2) {
        result = num1 * num2;
    }

    public int getResult() {
        return result;
    }

    public String getDoubleResult() {
        DecimalFormat myFormat = new DecimalFormat("0.00");
        return myFormat.format(result2);

    }

}
