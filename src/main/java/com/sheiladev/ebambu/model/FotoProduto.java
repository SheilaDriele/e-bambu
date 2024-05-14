package com.sheiladev.ebambu.model;

public class FotoProduto {
    private Long id;
    private String endereco;
    private String descricao;
    private Produto produto;

    public FotoProduto() {
    }

    public FotoProduto(Long id, String endereco, String descricao, Produto produto) {
        this.id = id;
        this.endereco = endereco;
        this.descricao = descricao;
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "FotoProduto{" +
                "id=" + id +
                ", endereco='" + endereco + '\'' +
                ", descricao='" + descricao + '\'' +
                ", produto=" + produto +
                '}';
    }
}
