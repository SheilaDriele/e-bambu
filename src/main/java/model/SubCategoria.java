package model;

public class SubCategoria {
    private Categoria categoria;
    private String nome;
    private String descricao;

    public SubCategoria() {
    }

    public SubCategoria(Categoria categoria, String nome, String descricao) {
        this.categoria = categoria;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "SubCategoria{" +
                "categoria=" + categoria +
                ", nome='" + nome + '\'' +
                ", descricao='" + descricao + '\'' +
                '}';
    }
}
