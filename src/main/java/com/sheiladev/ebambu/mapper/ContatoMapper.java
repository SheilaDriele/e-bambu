package com.sheiladev.ebambu.mapper;

import com.sheiladev.ebambu.entity.ContatoEntity;
import com.sheiladev.ebambu.model.Contato;

public class ContatoMapper implements MapperInterface<ContatoEntity, Contato> {

    @Override
    public Contato fromEntityToModel(ContatoEntity entity) {
        TipoContatoMapper mapper = new TipoContatoMapper();
        return new Contato(
                entity.getId(),
                mapper.fromEntityToModel(entity.getTipo()),
                entity.getValor());
    }

    @Override
    public ContatoEntity fromModelToEntity(Contato model) {
        return null;
    }

    @Override
    public String modelToString(Contato model) {
        return model.toString();
    }
}
