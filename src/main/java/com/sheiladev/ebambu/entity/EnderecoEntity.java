package com.sheiladev.ebambu.entity;

import com.sheiladev.ebambu.enumeradores.TipoEndereco;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "endereco")
public class EnderecoEntity {
    TipoEnderecoEntity tipo;
    String logradouro;
    String cep;
    String numero;
    String complemento;
    String bairro;

    public EnderecoEntity() {
    }

    public EnderecoEntity(TipoEnderecoEntity tipo, String logradouro, String cep, String numero, String complemento, String bairro) {
        this.tipo = tipo;
        this.logradouro = logradouro;
        this.cep = cep;
        this.numero = numero;
        this.complemento = complemento;
        this.bairro = bairro;
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
                "tipo=" + tipo +
                ", logradouro='" + logradouro + '\'' +
                ", cep='" + cep + '\'' +
                ", numero='" + numero + '\'' +
                ", complemento='" + complemento + '\'' +
                ", bairro='" + bairro + '\'' +
                '}';
    }
}
