package com.sheiladev.ebambu.model;

import java.math.BigInteger;

public class ProdutoSelecionado {
    private Long id;
    private Oferta oferta;
    private Promocao promocao;
    private BigInteger quantidade;

    public ProdutoSelecionado() {
    }

    public ProdutoSelecionado(Long id, Oferta oferta, Promocao promocao, BigInteger quantidade) {
        this.id = id;
        this.oferta = oferta;
        this.promocao = promocao;
        this.quantidade = quantidade;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
        this.oferta = oferta;
    }

    public Promocao getPromocao() {
        return promocao;
    }

    public void setPromocao(Promocao promocao) {
        this.promocao = promocao;
    }

    public BigInteger getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigInteger quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "ProdutoSelecionado{" +
                "id=" + id +
                ", oferta=" + oferta +
                ", promocao=" + promocao +
                ", quantidade=" + quantidade +
                '}';
    }
}
