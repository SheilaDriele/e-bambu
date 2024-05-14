package com.sheiladev.ebambu.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "foto_produto")
public class FotoProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String url;
    private String descricao;
    @ManyToOne
    private ProdutoEntity produto;

    public FotoProdutoEntity() {
    }

    public FotoProdutoEntity(Long id, String endereco, String descricao, ProdutoEntity produto) {
        this.id = id;
        this.url = endereco;
        this.descricao = descricao;
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public ProdutoEntity getProduto() {
        return produto;
    }

    public void setProduto(ProdutoEntity produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "FotoProduto{" +
                "url='" + url + '\'' +
                ", descricao='" + descricao + '\'' +
                ", produto=" + produto +
                '}';
    }
}
