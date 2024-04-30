package model;

import java.util.List;

public class Carrinho {
    private Pessoa pessoa;
    private List<ProdutoSelecionado> produtoSelecionados;


    public Carrinho() {
    }

    public Carrinho(Pessoa pessoa, List<ProdutoSelecionado> produtoSelecionados) {
        this.pessoa = pessoa;
        this.produtoSelecionados = produtoSelecionados;
    }

    public Pessoa getCliente() {
        return pessoa;
    }

    public void setCliente(Pessoa pessoa) {
        this.pessoa = pessoa;
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
                "cliente=" + pessoa +
                ", produtoSelecionados=" + produtoSelecionados +
                '}';
    }
}
