package com.sheiladev.ebambu.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "favorito")
public class FavoritoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private PessoaEntity cliente;
    @ManyToOne
    private ProdutoEntity produto;

    public FavoritoEntity() {
    }

    public FavoritoEntity(PessoaEntity cliente, ProdutoEntity produto) {
        this.cliente = cliente;
        this.produto = produto;
    }

    public PessoaEntity getCliente() {
        return cliente;
    }

    public void setCliente(PessoaEntity cliente) {
        this.cliente = cliente;
    }

    public ProdutoEntity getProduto() {
        return produto;
    }

    public void setProduto(ProdutoEntity produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "FavoritoEntity{" +
                "cliente=" + cliente +
                ", produto=" + produto +
                '}';
    }
}
