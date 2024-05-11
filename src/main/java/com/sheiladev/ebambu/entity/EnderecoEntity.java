package com.sheiladev.ebambu.entity;

import com.sheiladev.ebambu.enumeradores.TipoEndereco;
import jakarta.persistence.*;

@Entity
@Table(name = "endereco")
public class EnderecoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    TipoEnderecoEntity tipo;
    String logradouro;
    String cep;
    String numero;
    String complemento;
    String bairro;

    public EnderecoEntity() {
    }

    public EnderecoEntity(Long id, TipoEnderecoEntity tipo, String logradouro, String cep, String numero, String complemento, String bairro) {
        this.id = id;
        this.tipo = tipo;
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

    public TipoEnderecoEntity getTipo() {
        return tipo;
    }

    public void setTipo(TipoEnderecoEntity tipo) {
        this.tipo = tipo;
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
                ", tipo=" + tipo +
                ", logradouro='" + logradouro + '\'' +
                ", cep='" + cep + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
