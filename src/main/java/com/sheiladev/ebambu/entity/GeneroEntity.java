package com.sheiladev.ebambu.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "genero")
public class GeneroEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String nome;

    public GeneroEntity() {
    }

    public GeneroEntity(Long id, String nome) {
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
        return "GeneroEntity{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
