package model;

import java.util.List;

public class Pessoa {
    private DadosPessoais dadosPessoais;
    private List<Endereco> enderecos;
    private List<Contato> contatos;
    private Identificacao identificacao;

    public Pessoa() {
    }

    public Pessoa(DadosPessoais dadosPessoais, List<Endereco> enderecos, List<Contato> contatos, Identificacao identificacao) {
        this.dadosPessoais = dadosPessoais;
        this.enderecos = enderecos;
        this.contatos = contatos;
        this.identificacao = identificacao;
    }

    public DadosPessoais getDadosPessoais() {
        return dadosPessoais;
    }

    public void setDadosPessoais(DadosPessoais dadosPessoais) {
        this.dadosPessoais = dadosPessoais;
    }

    public List<Endereco> getEnderecos() {
        return enderecos;
    }

    public void setEnderecos(List<Endereco> enderecos) {
        this.enderecos = enderecos;
    }

    public List<Contato> getContatos() {
        return contatos;
    }

    public void setContatos(List<Contato> contatos) {
        this.contatos = contatos;
    }

    public Identificacao getIdentificacao() {
        return identificacao;
    }

    public void setIdentificacao(Identificacao identificacao) {
        this.identificacao = identificacao;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "dadosPessoais=" + dadosPessoais +
                ", enderecos=" + enderecos +
                ", contatos=" + contatos +
                ", identificacao=" + identificacao +
                '}';
    }
}

