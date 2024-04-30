package negocio.avaliacao;

import interfaces.Avaliacao;
import model.Pessoa;
import model.Produto;

public class AvaliacaoProduto implements Avaliacao {

    private double valor;
    private int nota;
    private Pessoa clienteAvaliador;
    private Produto produtoAvaliado;


    @Override
    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    public double getValor() {
        return valor;
    }

    public AvaliacaoProduto(double valor, Pessoa clienteAvaliador, Produto produtoAvaliado) {
        this.valor = valor;
        this.clienteAvaliador = clienteAvaliador;
        this.produtoAvaliado = produtoAvaliado;
    }

    public int getNota() {
        return nota;
    }

    public Pessoa getClienteAvaliador() {
        return clienteAvaliador;
    }

    public Produto getProdutoAvaliado() {
        return produtoAvaliado;
    }

    @Override
    public String toString() {
        return "AvaliacaoProduto{" +
                "valor=" + valor +
                ", nota=" + nota +
                ", clienteAvaliador=" + clienteAvaliador +
                ", produtoAvaliado=" + produtoAvaliado +
                '}';
    }
}
