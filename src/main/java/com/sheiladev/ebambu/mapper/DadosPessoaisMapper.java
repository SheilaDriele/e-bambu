package com.sheiladev.ebambu.mapper;

import com.sheiladev.ebambu.entity.DadosPessoaisEntity;
import com.sheiladev.ebambu.entity.GeneroEntity;
import com.sheiladev.ebambu.enumeradores.Genero;
import com.sheiladev.ebambu.model.DadosPessoais;

public class DadosPessoaisMapper implements MapperInterface<DadosPessoaisEntity, DadosPessoais> {

    @Override
    public DadosPessoais fromEntityToModel(DadosPessoaisEntity entity) {
        return new DadosPessoais(entity.getNome(),
                entity.getDataNascimento(),
                Genero.get(entity.getId()),
                entity.getDocumento());
    }

    @Override
    public DadosPessoaisEntity fromModelToEntity(DadosPessoais model) {
        return new DadosPessoaisEntity(null,
                model.getNome(),
                model.getDataNascimento(),
                new GeneroEntity(model.getGenero().getId(), model.getGenero().toString()),
                model.getDocumento());
    }

    @Override
    public String modelToString(DadosPessoais model) {
        return model.toString();
    }
}
