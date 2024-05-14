package com.sheiladev.ebambu.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "identificacao")
public class IdentificacaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String codigo;
    private String login;
    private String password;

    public IdentificacaoEntity() {
    }

    public IdentificacaoEntity(Long id, String codigo, String login, String password) {
        this.id = id;
        this.codigo = codigo;
        this.login = login;
        this.password = password;
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
        return "IdentificacaoEntity{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", login='" + login + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
