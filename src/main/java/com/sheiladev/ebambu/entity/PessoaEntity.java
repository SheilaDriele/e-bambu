package com.sheiladev.ebambu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

;

@Entity
@Table(name = "pessoa")
public class PessoaEntity {
    private DadosPessoaisEntity dadosPessoais;
    @OneToMany
    private List<EnderecoEntity> enderecos;
    @OneToMany
    private List<ContatoEntity> contatos;
    private IdentificacaoEntity identificacao;

    public PessoaEntity() {
    }

    public PessoaEntity(DadosPessoaisEntity dadosPessoais, List<EnderecoEntity> enderecos, List<ContatoEntity> contatos, IdentificacaoEntity identificacao) {
        this.dadosPessoais = dadosPessoais;
        this.enderecos = enderecos;
        this.contatos = contatos;
        this.identificacao = identificacao;
    }

    public DadosPessoaisEntity getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoaisEntity dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public List<EnderecoEntity> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<EnderecoEntity> enderecos) {
        this.enderecos = enderecos;
    }

    public List<ContatoEntity> getContatos() {
        return contatos;
    }

    public void setContatos(List<ContatoEntity> contatos) {
        this.contatos = contatos;
    }

    public IdentificacaoEntity getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(IdentificacaoEntity identificacao) {
        this.identificacao = identificacao;
    }

    @Override
    public String toString() {
        return "PessoaEntity{" +
                "dadosPessoais=" + dadosPessoais +
                ", enderecos=" + enderecos +
                ", contatos=" + contatos +
                ", identificacao=" + identificacao +
                '}';
    }
}

