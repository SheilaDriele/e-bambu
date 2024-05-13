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
}
