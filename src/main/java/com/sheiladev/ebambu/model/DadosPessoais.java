package com.sheiladev.ebambu.model;

import com.sheiladev.ebambu.enumeradores.Genero;

import java.time.LocalDate;

public class DadosPessoais {
    private Long id;
    private String nome;
    private LocalDate dataNascimento;
    private Genero genero;
    private String documento;

    public DadosPessoais() {
    }

    public DadosPessoais(Long id, String nome, LocalDate dataNascimento, Genero genero, String documento) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.genero = genero;
        this.documento = documento;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    @Override
    public String toString() {
        return "DadosPessoais{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", genero=" + genero +
                ", documento='" + documento + '\'' +
                '}';
    }
}

