package model;
import model.Login;
public enum tuCarroInstance {
    INSTANCE;
    private final Login login;

    tuCarroInstance() {
        login = new Login(new TuCarro());
    }

    public Login getLogin(){
        return login;
    }
}
