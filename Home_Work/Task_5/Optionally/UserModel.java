package Home_Work.Task_5.Optionally;

import java.util.ArrayList;

public class UserModel {

    private String userData = "";

    public void registerInfo(String name, String login, String passvord) {
       userData += "Имя: " + name + ", Логин: " + login +
       ", Пароль: " + passvord;
    }

    public String getUserData() {
        return userData;
    }
}
