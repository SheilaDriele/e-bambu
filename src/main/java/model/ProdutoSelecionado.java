package model;

import java.math.BigInteger;

public class ProdutoSelecionado {
        private Oferta oferta;
        private Promocao promocao;
        private BigInteger quantidade;

    public ProdutoSelecionado() {
    }

    public ProdutoSelecionado(Oferta oferta, Promocao promocao, BigInteger quantidade) {
        this.oferta = oferta;
        this.promocao = promocao;
        this.quantidade = quantidade;
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
                "oferta=" + oferta +
                ", promocao=" + promocao +
                ", quantidade=" + quantidade +
                '}';
    }
}
