package model;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class Oferta {
    private BigDecimal valor;
    private LocalDateTime dataHoraInicial;
    private Produto produto;

    public Oferta() {
    }

    public Oferta(BigDecimal valor, LocalDateTime dataHoraInicial, Produto produto) {
        this.valor = valor;
        this.dataHoraInicial = dataHoraInicial;
        this.produto = produto;
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
                "valor=" + valor +
                ", dataHoraInicial=" + dataHoraInicial +
                ", produto=" + produto +
                '}';
    }
}
