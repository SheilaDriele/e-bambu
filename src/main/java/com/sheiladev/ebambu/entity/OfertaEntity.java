package com.sheiladev.ebambu.entity;

import com.sheiladev.ebambu.model.Produto;
import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "oferta")
public class OfertaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private BigDecimal valor;
    @Column(name = "data_hora_inicial")
    private LocalDateTime dataHoraInicial;
    @ManyToOne
    private Produto produto;

    public OfertaEntity() {
    }

    public OfertaEntity(Long id, BigDecimal valor, LocalDateTime dataHoraInicial, Produto produto) {
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
        return "OfertaEntity{" +
                "id=" + id +
                ", valor=" + valor +
                ", dataHoraInicial=" + dataHoraInicial +
                ", produto=" + produto +
                '}';
    }
}
