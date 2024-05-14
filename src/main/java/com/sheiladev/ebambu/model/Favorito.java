package com.sheiladev.ebambu.model;

public class Favorito {
    private Long id;
    private Pessoa cliente;
    private Produto produto;

    public Favorito() {
    }

    public Favorito(Long id, Pessoa cliente, Produto produto) {
        this.id = id;
        this.cliente = cliente;
        this.produto = produto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Pessoa getCliente() {
        return cliente;
    }

    public void setCliente(Pessoa cliente) {
        this.cliente = cliente;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "Favorito{" +
                "id=" + id +
                ", cliente=" + cliente +
                ", produto=" + produto +
                '}';
    }
}
