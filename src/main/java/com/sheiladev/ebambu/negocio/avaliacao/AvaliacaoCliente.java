package com.sheiladev.ebambu.negocio.avaliacao;

import com.sheiladev.ebambu.interfaces.Avaliacao;
import com.sheiladev.ebambu.model.Pessoa;

public class AvaliacaoCliente implements Avaliacao {

    private double valor;
    private int nota;
    private Pessoa vendedorAvaliador;
    private Pessoa clienteAvaliado;

    @Override
    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public double getValor() {
        return valor;
    }

    public AvaliacaoCliente(double valor, Pessoa vendedorAvaliador, Pessoa clienteAvaliado) {
        this.valor = valor;
        this.vendedorAvaliador = vendedorAvaliador;
        this.clienteAvaliado = clienteAvaliado;
    }

    public int getNota() {
        return nota;
    }

    public Pessoa getVendedorAvaliador() {
        return vendedorAvaliador;
    }

    public Pessoa getClienteAvaliado() {
        return clienteAvaliado;
    }

    @Override
    public String toString() {
        return "AvaliacaoCliente{" +
                "valor=" + valor +
                ", nota=" + nota +
                ", vendedorAvaliador=" + vendedorAvaliador +
                ", clienteAvaliado=" + clienteAvaliado +
                '}';
    }
}
