package com.sheiladev.ebambu.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_documento")
public class TipoDocumentoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public TipoDocumentoEntity() {
    }

    public TipoDocumentoEntity(Long id, String nome) {
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
        return "TipoDocumentoEntity{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
