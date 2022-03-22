package company;

public abstract class User {
    /*
        1. Создать абстрактный класс «Пользователь». У него должно быть публичное свойство «Логин»,
    приватное свойство «пароль».
     */
    public String Login;
    private String password;

    public User(String login) {
        Login = login;
    }

    public String getLogin() {
        return Login;
    }

    public void setLogin(String login) {
        Login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
