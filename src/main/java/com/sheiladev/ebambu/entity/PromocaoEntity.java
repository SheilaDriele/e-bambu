package com.sheiladev.ebambu.entity;

import jakarta.persistence.*;

import java.math.BigDecimal;
import java.time.LocalDateTime;

@Entity
@Table(name = "promocao")
public class PromocaoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private BigDecimal valor;
    @ManyToOne
    private OfertaEntity oferta;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private BigDecimal quantidade;

    public PromocaoEntity() {
    }

    public PromocaoEntity(Long id, BigDecimal valor, OfertaEntity oferta, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, BigDecimal quantidade) {
        this.id = id;
        this.valor = valor;
        this.oferta = oferta;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.quantidade = quantidade;
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

    public OfertaEntity getOferta() {
        return oferta;
    }

    public void setOferta(OfertaEntity oferta) {
        this.oferta = oferta;
    }

    public LocalDateTime getDataHoraInicio() {
        return dataHoraInicio;
    }

    public void setDataHoraInicio(LocalDateTime dataHoraInicio) {
        this.dataHoraInicio = dataHoraInicio;
    }

    public LocalDateTime getDataHoraFim() {
        return dataHoraFim;
    }

    public void setDataHoraFim(LocalDateTime dataHoraFim) {
        this.dataHoraFim = dataHoraFim;
    }

    public BigDecimal getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(BigDecimal quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "PromocaoEntity{" +
                "id=" + id +
                ", valor=" + valor +
                ", oferta=" + oferta +
                ", dataHoraInicio=" + dataHoraInicio +
                ", dataHoraFim=" + dataHoraFim +
                ", quantidade=" + quantidade +
                '}';
    }
}
