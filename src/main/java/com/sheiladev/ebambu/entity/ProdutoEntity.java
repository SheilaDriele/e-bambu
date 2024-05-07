package com.sheiladev.ebambu.entity;

import jakarta.persistence.*;
import com.sheiladev.ebambu.model.Caracteristica;
import com.sheiladev.ebambu.model.Categoria;
import com.sheiladev.ebambu.model.SubCategoria;
import java.util.List;

@Entity
@Table(name = "produto")
public class ProdutoEntity {
    @Id
    @GeneratedValue
    private Long id;
    private String codigo;
   //@Column(name = "categoria_id")
   //private Categoria categoria;
   //@Column(name = "subcategoria_id")
   //private SubCategoria subCategoria;
   //private String descricao;
   //@ManyToMany(mappedBy = "produto")
   //private List<Caracteristica> caracteristicas;

}
