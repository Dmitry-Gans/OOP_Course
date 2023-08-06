package Home_Work.Task_5.Optionally;

public class UserMain {
    
    public static void main(String[] args) {
        UserModel model = new UserModel();
        UserView view = new UserView();
        UserPresenter presenter = new UserPresenter(model, view);

        presenter.addClickedRegister();
        presenter.addClickedLogIn();
        presenter.addClickedChangePassword();
    }
}
