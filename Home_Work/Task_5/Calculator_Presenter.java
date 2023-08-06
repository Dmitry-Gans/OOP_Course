package Home_Work.Task_5;

public class Calculator_Presenter {

    private Calculator_Model model;
    private Calculator_View view;

    public Calculator_Presenter(Calculator_Model model, Calculator_View view) {
        this.model = model;
        this.view = view;
    }

    public void add_Button_Clicked_Summ(){
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();
        model.summ(number1, number2);
        int resultSumm = model.getResult();
        view.displayResult(resultSumm);
    }

    public void add_Button_Clicked_Subtract(){
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();
        model.subtract(number1, number2);
        int resultSubtract = model.getResult();
        view.displayResult(resultSubtract);
    }

    public void add_Button_Clicked_Divide(){
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();
        model.divide(number1, number2);
        String resultDivide = model.getDoubleResult();
        view.displayDoubleResult(resultDivide);
    }

    public void add_Button_Clicked_Multiply(){
        int number1 = view.getUserInput();
        int number2 = view.getUserInput();
        model.multiply(number1, number2);
        int resultMultiply = model.getResult();
        view.displayResult(resultMultiply);
    }
    
}
