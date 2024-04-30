package model;

public class FotoProduto {
    private String endereco;
    private String descricao;
    private Produto produto;

    public FotoProduto() {
    }

    public FotoProduto(String endereco, String descricao, Produto produto) {
        this.endereco = endereco;
        this.descricao = descricao;
        this.produto = produto;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Produto getProduto() {
        return produto;
    }

    public void setProduto(Produto produto) {
        this.produto = produto;
    }

    @Override
    public String toString() {
        return "FotoProduto{" +
                "endereco='" + endereco + '\'' +
                ", descricao='" + descricao + '\'' +
                ", produto=" + produto +
                '}';
    }
}
