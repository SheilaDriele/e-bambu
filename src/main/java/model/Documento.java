package model;

import enumeradores.TipoDocumeto;

import java.time.LocalDate;

public class Documento{
    private TipoDocumeto tipo;
    private String numero;
    private LocalDate dataEmissao;
    private String nacionalidade;
    private String orgaoEmissor;

    public Documento() {
    }

    public Documento(TipoDocumeto tipo, String numero, LocalDate dataEmissao, String nacionalidade, String orgaoEmissor) {
        this.tipo = tipo;
        this.numero = numero;
        this.dataEmissao = dataEmissao;
        this.nacionalidade = nacionalidade;
        this.orgaoEmissor = orgaoEmissor;
    }

    public TipoDocumeto getTipo() {
        return tipo;
    }

    public void setTipo(TipoDocumeto tipo) {
        this.tipo = tipo;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public LocalDate getDataEmissao() {
        return dataEmissao;
    }

    public void setDataEmissao(LocalDate dataEmissao) {
        this.dataEmissao = dataEmissao;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public String getOrgaoEmissor() {
        return orgaoEmissor;
    }

    public void setOrgaoEmissor(String orgaoEmissor) {
        this.orgaoEmissor = orgaoEmissor;
    }

    @Override
    public String toString() {
        return "Documento{" +
                "tipo=" + tipo +
                ", numero='" + numero + '\'' +
                ", dataEmissao=" + dataEmissao +
                ", nacionalidade='" + nacionalidade + '\'' +
                ", orgaoEmissor='" + orgaoEmissor + '\'' +
                '}';
    }
}
