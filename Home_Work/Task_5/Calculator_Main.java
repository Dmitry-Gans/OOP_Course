package Home_Work.Task_5;

public class Calculator_Main {
    public static void main(String[] args) {
        Calculator_Model model = new Calculator_Model();
        Calculator_View view = new Calculator_View();
        Calculator_Presenter presenter = new Calculator_Presenter(model, view);

        presenter.add_Button_Clicked_Summ();
        presenter.add_Button_Clicked_Subtract();
        presenter.add_Button_Clicked_Divide();
        presenter.add_Button_Clicked_Multiply();
    }
}
