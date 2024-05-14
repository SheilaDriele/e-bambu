package com.sheiladev.ebambu.model;

import com.sheiladev.ebambu.enumeradores.TipoContato;

public class Contato {
    private TipoContato tipo;
    private String valor;

    public Contato() {
    }

    public Contato(TipoContato tipo, String valor) {
        this.tipo = tipo;
        this.valor = valor;
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
                "tipo=" + tipo +
                ", valor='" + valor + '\'' +
                '}';
    }
}
