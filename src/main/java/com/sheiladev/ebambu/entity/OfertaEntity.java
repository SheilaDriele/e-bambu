package com.sheiladev.ebambu.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "oferta")
public class OfertaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valor;
    @Column(name = "data_hora_inicial")
    private LocalDateTime dataHoraInicial;
    @ManyToOne
    private ProdutoEntity produto;

    public OfertaEntity() {
    }

    public OfertaEntity(Long id, BigDecimal valor, LocalDateTime dataHoraInicial, ProdutoEntity produto) {
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

    public ProdutoEntity getProduto() {
        return produto;
    }

    public void setProduto(ProdutoEntity produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "OfertaEntity{" +
                "id=" + id +
                ", valor=" + valor +
                ", dataHoraInicial=" + dataHoraInicial +
                ", produto=" + produto +
                '}';
    }
}
