package com.sheiladev.ebambu.entity;

import jakarta.persistence.*;

import java.math.BigInteger;

@Entity
@Table(name = "produto_selecionado")
public class ProdutoSelecionadoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private OfertaEntity oferta;
    @ManyToOne
    private PromocaoEntity promocao;
    private BigInteger quantidade;

    public ProdutoSelecionadoEntity() {
    }

    public ProdutoSelecionadoEntity(Long id, OfertaEntity oferta, PromocaoEntity promocao, BigInteger quantidade) {
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

    public OfertaEntity getOferta() {
        return oferta;
    }

    public void setOferta(OfertaEntity oferta) {
        this.oferta = oferta;
    }

    public PromocaoEntity getPromocao() {
        return promocao;
    }

    public void setPromocao(PromocaoEntity promocao) {
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
        return "ProdutoSelecionadoEntity{" +
                "id=" + id +
                ", oferta=" + oferta +
                ", promocao=" + promocao +
                ", quantidade=" + quantidade +
                '}';
    }
}
