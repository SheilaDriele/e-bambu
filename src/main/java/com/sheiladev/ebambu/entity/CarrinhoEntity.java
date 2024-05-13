package com.sheiladev.ebambu.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "carrinho")
public class CarrinhoEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @OneToOne
    private PessoaEntity pessoa;
    @ManyToMany
    private List<ProdutoSelecionadoEntity> produtoSelecionados;


    public CarrinhoEntity() {
    }

    public CarrinhoEntity(PessoaEntity pessoa, List<ProdutoSelecionadoEntity> produtoSelecionados) {
        this.pessoa = pessoa;
        this.produtoSelecionados = produtoSelecionados;
    }

    public PessoaEntity getPessoa() {
        return pessoa;
    }

    public void setPessoa(PessoaEntity pessoa) {
        this.pessoa = pessoa;
    }

    public List<ProdutoSelecionadoEntity> getProdutoSelecionados() {
        return produtoSelecionados;
    }

    public void setProdutoSelecionados(List<ProdutoSelecionadoEntity> produtoSelecionados) {
        this.produtoSelecionados = produtoSelecionados;
    }

    @Override
    public String toString() {
        return "CarrinhoEntity{" +
                "pessoa=" + pessoa +
                ", produtoSelecionados=" + produtoSelecionados +
                '}';
    }
}
