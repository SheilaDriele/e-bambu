package com.sheiladev.ebambu.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Oferta {
    private Long id;
    private BigDecimal valor;
    private LocalDateTime dataHoraInicial;
    private Produto produto;

    public Oferta() {
    }

    public Oferta(Long id, BigDecimal valor, LocalDateTime dataHoraInicial, Produto produto) {
        this.id = id;
        this.valor = valor;
        this.dataHoraInicial = dataHoraInicial;
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public LocalDateTime getDataHoraInicial() {
        return dataHoraInicial;
    }

    public void setDataHoraInicial(LocalDateTime dataHoraInicial) {
        this.dataHoraInicial = dataHoraInicial;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Oferta{" +
                "id=" + id +
                ", valor=" + valor +
                ", dataHoraInicial=" + dataHoraInicial +
                ", produto=" + produto +
                '}';
    }
}
