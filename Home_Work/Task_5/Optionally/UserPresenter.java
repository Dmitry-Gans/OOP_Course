package Home_Work.Task_5.Optionally;

public class UserPresenter {

    private UserModel model;
    private UserView view;

    public UserPresenter(UserModel model, UserView view) {
        this.model = model;
        this.view = view;
    }

    public void addClickedRegister() {
        System.out.println("Для регистрации введите Имя, Логин, Пароль: ");
        String name = view.getRegisterAccount();
        String login = view.getRegisterAccount();
        String passvord = view.getRegisterAccount();
        model.registerInfo(name, login, passvord);
        String resultRegistr = model.getUserData();
        view.displayResult(resultRegistr);
        System.out.println();
    }

    public void addClickedLogIn() {
        System.out.println("Для входа введите Логин и Пароль: ");
        String login = view.getlogIn();
        String passvord = view.getlogIn();
        view.displayLogIn(login);
        System.out.println();
    }

    public void addClickedChangePassword() {
        System.out.println("Для смены пароля введите Логин: ");
        String name = view.getlogIn();
        String passvord = view.getChangePassword();
        view.displayPassvord(name, passvord);
        System.out.println();
    }
}
