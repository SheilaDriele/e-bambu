package entity;

import jakarta.persistence.*;
import model.Caracteristica;
import model.Categoria;
import model.SubCategoria;
import java.util.List;

@Entity
@Table(name = "produto")
public class ProdutoEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String codigo;
    @Column(name = "categoria_id")
    private Categoria categoria;
    @Column(name = "subcategoria_id")
    private SubCategoria subCategoria;
    private String descricao;
    @ManyToMany(mappedBy = "produto")
    private List<Caracteristica> caracteristicas;

}
