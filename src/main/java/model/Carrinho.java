package model;

import java.util.List;

public class Carrinho {
    private Cliente cliente;
    private List<ProdutoSelecionado> produtoSelecionados;


    public Carrinho() {
    }

    public Carrinho(Cliente cliente, List<ProdutoSelecionado> produtoSelecionados) {
        this.cliente = cliente;
        this.produtoSelecionados = produtoSelecionados;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public List<ProdutoSelecionado> getProdutoSelecionados() {
        return produtoSelecionados;
    }

    public void setProdutoSelecionados(List<ProdutoSelecionado> produtoSelecionados) {
        this.produtoSelecionados = produtoSelecionados;
    }

    @Override
    public String toString() {
        return "Carrinho{" +
                "cliente=" + cliente +
                ", produtoSelecionados=" + produtoSelecionados +
                '}';
    }
}
