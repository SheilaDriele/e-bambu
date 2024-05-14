package com.sheiladev.ebambu.model;

import java.util.Arrays;

/**
 * Protótipo de identificação
 *
 * @param id
 * @param login
 * @param password
 */
public class Identificacao {
    private Long id;
    private String codigo;
    private String login;
    private String password;

    private String[] logins = {"sheila", "flavio"};

    public Identificacao() {
    }

    public Identificacao(Long id, String codigo, String login, String password, String[] logins) {
        this.id = id;
        this.codigo = codigo;
        this.login = login;
        this.password = password;
        this.logins = logins;
    }

    public boolean login() {
        return Arrays.stream(logins).anyMatch(l -> l.equalsIgnoreCase(login));
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
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
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                ", logins=" + Arrays.toString(logins) +
                '}';
    }
}
