package com.sheiladev.ebambu.entity;

import com.sheiladev.ebambu.model.Produto;
import jakarta.persistence.*;

@Entity
@Table(name = "foto_produto")
public class FotoProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String endereco;
    private String descricao;
    private Produto produto;

    public FotoProdutoEntity() {
    }

    public FotoProdutoEntity(Long id, String endereco, String descricao, Produto produto) {
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
                "endereco='" + endereco + '\'' +
                ", descricao='" + descricao + '\'' +
                ", produto=" + produto +
                '}';
    }
}
