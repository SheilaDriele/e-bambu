package com.sheiladev.ebambu.entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
@Table(name = "produto")
public class ProdutoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String codigo;
    @ManyToOne
    @JoinColumn(name = "categoria_id")
    private CategoriaEntity categoria;
    @ManyToOne
    @JoinColumn(name = "subcategoria_id")
    private SubCategoriaEntity subCategoria;
    private String descricao;
    @ManyToMany
    private List<CaracteristicaEntity> caracteristicas;

    public ProdutoEntity() {
    }

    public ProdutoEntity(Long id, String codigo, CategoriaEntity categoria, SubCategoriaEntity subCategoria, String descricao, List<CaracteristicaEntity> caracteristicas) {
        this.id = id;
        this.codigo = codigo;
        this.categoria = categoria;
        this.subCategoria = subCategoria;
        this.descricao = descricao;
        this.caracteristicas = caracteristicas;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public CategoriaEntity getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEntity categoria) {
        this.categoria = categoria;
    }

    public SubCategoriaEntity getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(SubCategoriaEntity subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<CaracteristicaEntity> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(List<CaracteristicaEntity> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "ProdutoEntity{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", categoria=" + categoria +
                ", subCategoria=" + subCategoria +
                ", descricao='" + descricao + '\'' +
                ", caracteristicas=" + caracteristicas +
                '}';
    }
}
