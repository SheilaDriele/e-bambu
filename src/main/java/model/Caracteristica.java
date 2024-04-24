package model;

import java.math.BigDecimal;

public class Caracteristica {
   private String nome;
   private BigDecimal valor;
   private String unidadeMedida;

    public Caracteristica() {
    }

    public Caracteristica(String nome, BigDecimal valor, String unidadeMedida) {
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

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
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
