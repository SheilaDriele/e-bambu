package com.sheiladev.ebambu.model;

public class Caracteristica {
   private String nome;
   private String valor;
   private String unidadeMedida;

    public Caracteristica() {
    }

    public Caracteristica(String nome, String valor, String unidadeMedida) {
        this.nome = nome;
        this.valor = valor;
        this.unidadeMedida = unidadeMedida;
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
                "nome='" + nome + '\'' +
                ", valor=" + valor +
                ", unidadeMedida='" + unidadeMedida + '\'' +
                '}';
    }
}
