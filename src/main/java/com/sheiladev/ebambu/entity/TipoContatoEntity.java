package com.sheiladev.ebambu.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_de_contato")
public class TipoContatoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nome;

    public TipoContatoEntity() {
    }

    public TipoContatoEntity(Long id, String nome) {
        this.id = id;
        this.nome = nome;
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

    @Override
    public String toString() {
        return "TipoContatoEntity{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
