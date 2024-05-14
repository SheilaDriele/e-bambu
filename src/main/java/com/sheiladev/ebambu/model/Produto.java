package com.sheiladev.ebambu.model;

import java.util.List;

public class Produto {
    private Long id;
    private String codigo;
    private Categoria categoria;
    private SubCategoria subCategoria;
    private String descricao;
    private List<Caracteristica> caracteristicas;


    public Produto() {
    }

    public Produto(Long id, String codigo, Categoria categoria, SubCategoria subCategoria, String descricao, List<Caracteristica> caracteristicas) {
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

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public SubCategoria getSubCategoria() {
        return subCategoria;
    }

    public void setSubCategoria(SubCategoria subCategoria) {
        this.subCategoria = subCategoria;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public List<Caracteristica> getCaracteristicas() {
        return caracteristicas;
    }

    public void setCaracteristicas(List<Caracteristica> caracteristicas) {
        this.caracteristicas = caracteristicas;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "id=" + id +
                ", codigo='" + codigo + '\'' +
                ", categoria=" + categoria +
                ", subCategoria=" + subCategoria +
                ", descricao='" + descricao + '\'' +
                ", caracteristicas=" + caracteristicas +
                '}';
    }
}
