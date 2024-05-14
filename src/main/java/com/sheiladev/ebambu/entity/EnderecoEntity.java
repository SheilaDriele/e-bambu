package com.sheiladev.ebambu.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "endereco")
public class EnderecoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    TipoEnderecoEntity tipoEndereco;
    private String logradouro;
    private String cep;
    private String numero;
    private String complemento;
    private String bairro;

    public EnderecoEntity() {
    }

    public EnderecoEntity(Long id, TipoEnderecoEntity tipo, String logradouro, String cep, String numero, String complemento, String bairro) {
        this.id = id;
        this.tipoEndereco = tipo;
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public TipoEnderecoEntity getTipoEndereco() {
        return tipoEndereco;
    }

    public void setTipoEndereco(TipoEnderecoEntity tipoEndereco) {
        this.tipoEndereco = tipoEndereco;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "EnderecoEntity{" +
                "id=" + id +
                ", tipoEndereco=" + tipoEndereco +
                ", logradouro='" + logradouro + '\'' +
                ", cep='" + cep + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
