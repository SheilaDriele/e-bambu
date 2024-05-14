package com.sheiladev.ebambu.model;

import com.sheiladev.ebambu.enumeradores.TipoContato;

public class Contato {
    private Long id;
    private TipoContato tipo;
    private String valor;

    public Contato() {
    }

    public Contato(Long id, TipoContato tipo, String valor) {
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

    public TipoContato getTipo() {
        return tipo;
    }

    public void setTipo(TipoContato tipo) {
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
        return "Contato{" +
                "id=" + id +
                ", tipo=" + tipo +
                ", valor='" + valor + '\'' +
                '}';
    }
}
