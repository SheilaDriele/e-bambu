package model;

import java.util.Arrays;

/**
 * Protótipo de identificação
 * @param id
 * @param login
 * @param password
 */
public class Identificacao {
        private String id;
        private String login;
        private String password;

        private String[] logins = {"sheila", "flavio"};

    public Identificacao() {
    }

    public Identificacao(String id, String login, String password) {
        this.id = id;
        this.login = login;
        this.password = password;
    }

    public boolean login(){
        return Arrays.stream(logins).anyMatch(l -> l.equalsIgnoreCase(login));
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Identificacao{" +
                "id='" + id + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
