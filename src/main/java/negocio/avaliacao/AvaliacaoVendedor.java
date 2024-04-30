package negocio.avaliacao;

import interfaces.Avaliacao;
import model.Pessoa;

public class AvaliacaoVendedor implements Avaliacao {

    private double valor;
    private int nota;
    private Pessoa clienteAvaliador;
    private Pessoa vendedorAvaliado;

    @Override
    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public double getValor() {
        return valor;
    }

    public AvaliacaoVendedor(double valor, Pessoa clienteAvaliador, Pessoa vendedorAvaliado) {
        this.valor = valor;
        this.clienteAvaliador = clienteAvaliador;
        this.vendedorAvaliado = vendedorAvaliado;
    }

    public int getNota() {
        return nota;
    }

    public Pessoa getClienteAvaliador() {
        return clienteAvaliador;
    }

    public Pessoa getVendedorAvaliado() {
        return vendedorAvaliado;
    }

    @Override
    public String toString() {
        return "AvaliacaoVendedor{" +
                "valor=" + valor +
                ", nota=" + nota +
                ", clienteAvaliador=" + clienteAvaliador +
                ", vendedorAvaliado=" + vendedorAvaliado +
                '}';
    }
}
