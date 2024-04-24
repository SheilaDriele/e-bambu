package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Promocao {
    private BigDecimal valor;
    private Oferta oferta;
    private LocalDateTime dataHoraInicio;
    private LocalDateTime dataHoraFim;
    private BigDecimal quantidade;

    public Promocao() {
    }

    public Promocao(BigDecimal valor, Oferta oferta, LocalDateTime dataHoraInicio, LocalDateTime dataHoraFim, BigDecimal quantidade) {
        this.valor = valor;
        this.oferta = oferta;
        this.dataHoraInicio = dataHoraInicio;
        this.dataHoraFim = dataHoraFim;
        this.quantidade = quantidade;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public void setValor(BigDecimal valor) {
        this.valor = valor;
    }

    public Oferta getOferta() {
        return oferta;
    }

    public void setOferta(Oferta oferta) {
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
        return "Promocao{" +
                "valor=" + valor +
                ", oferta=" + oferta +
                ", dataHoraInicio=" + dataHoraInicio +
                ", dataHoraFim=" + dataHoraFim +
                ", quantidade=" + quantidade +
                '}';
    }
}
