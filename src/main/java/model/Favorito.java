package model;

public class Favorito {
    private Pessoa cliente;
    private Produto produto;

    public Favorito() {
    }

    public Favorito(Pessoa cliente, Produto produto) {
        this.cliente = cliente;
        this.produto = produto;
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
                "cliente=" + cliente +
                ", produto=" + produto +
                '}';
    }
}
