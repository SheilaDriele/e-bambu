package com.sheiladev.ebambu.entity;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
@Table(name = "dados_pessoais")
public class DadosPessoaisEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;
    @Column(name = "data_nascimento")
    private LocalDate dataNascimento;
    @ManyToOne
    private GeneroEntity genero;
    private String documento;

    public DadosPessoaisEntity() {
    }

    public DadosPessoaisEntity(Long id, String nome, LocalDate dataNascimento, GeneroEntity genero, String documento) {
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

    public GeneroEntity getGenero() {
        return genero;
    }

    public void setGenero(GeneroEntity genero) {
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
        return "DadosPessoaisEntity{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                ", dataNascimento=" + dataNascimento +
                ", genero=" + genero +
                ", documento='" + documento + '\'' +
                '}';
    }
}

