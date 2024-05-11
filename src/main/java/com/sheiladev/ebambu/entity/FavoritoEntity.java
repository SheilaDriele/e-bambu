package com.sheiladev.ebambu.entity;

import com.sheiladev.ebambu.model.Pessoa;
import com.sheiladev.ebambu.model.Produto;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "favorito")
public class FavoritoEntity {
    @OneToMany
    private PessoaEntity cliente;
    @OneToMany
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
