package twentyfive.spring.oop.groupe1.finalproject.m24w7304;

public abstract class User {
    private final String username;
    private final String password;

    protected User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public abstract boolean login();

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
