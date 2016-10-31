package java.model;

/**
 * Created by lost on 27.09.2016.
 */
public class User {
    private String login;
    protected String password;
    private String name;
    private String mail;


    //// TODO: 26.09.2016 user md5 for password
    public User() {
    }

    public User(String login, String name, String mail) {
        this.login = login;
        this.name = name;
        this.mail = mail;
    }

    public User(String login, String password) {

        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        User user = (User) o;

        if (login != null ? !login.equals(user.login) : user.login != null) return false;
        return password != null ? password.equals(user.password) : user.password == null;

    }

    @Override
    public int hashCode() {
        return login != null ? login.hashCode() : 0;
    }

    @Override
    public String toString() {
        return "User{" +
                "login='" + login + '\'' +
                '}';
    }
}
