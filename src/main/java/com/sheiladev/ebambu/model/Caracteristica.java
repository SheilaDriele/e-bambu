package com.sheiladev.ebambu.model;

public class Caracteristica {
    private Long id;
    private String nome;
    private String valor;
    private String unidadeMedida;

    public Caracteristica() {
    }

    public Caracteristica(Long id, String nome, String valor, String unidadeMedida) {
        this.id = id;
        this.nome = nome;
        this.valor = valor;
        this.unidadeMedida = unidadeMedida;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    public String getUnidadeMedida() {
        return unidadeMedida;
    }

    public void setUnidadeMedida(String unidadeMedida) {
        this.unidadeMedida = unidadeMedida;
    }

    @Override
    public String toString() {
        return "Caracteristica{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", valor='" + valor + '\'' +
                ", unidadeMedida='" + unidadeMedida + '\'' +
                '}';
    }
}
