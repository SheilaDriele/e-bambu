package com.sheiladev.ebambu.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "contato")
public class ContatoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    private TipoContatoEntity tipo;
    private String valor;

    public ContatoEntity() {
    }

    public ContatoEntity(Long id, TipoContatoEntity tipo, String valor) {
        this.id = id;
        this.tipo = tipo;
        this.valor = valor;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoContatoEntity getTipo() {
        return tipo;
    }

    public void setTipo(TipoContatoEntity tipo) {
        this.tipo = tipo;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "ContatoEntity{" +
                "id=" + id +
                ", tipo=" + tipo +
                ", valor='" + valor + '\'' +
                '}';
    }
}
