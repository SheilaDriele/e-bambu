package com.sheiladev.ebambu.model;

import java.util.List;

public class Carrinho {
    private Long id;
    private Pessoa pessoa;
    private List<ProdutoSelecionado> produtoSelecionados;


    public Carrinho() {
    }

    public Carrinho(Long id, Pessoa pessoa, List<ProdutoSelecionado> produtoSelecionados) {
        this.id = id;
        this.pessoa = pessoa;
        this.produtoSelecionados = produtoSelecionados;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getPessoa() {
        return pessoa;
    }

    public void setPessoa(Pessoa pessoa) {
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
                "id=" + id +
                ", pessoa=" + pessoa +
                ", produtoSelecionados=" + produtoSelecionados +
                '}';
    }
}
