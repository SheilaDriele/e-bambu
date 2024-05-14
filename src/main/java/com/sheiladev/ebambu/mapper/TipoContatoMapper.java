package com.sheiladev.ebambu.mapper;

import com.sheiladev.ebambu.entity.TipoContatoEntity;
import com.sheiladev.ebambu.enumeradores.TipoContato;

public class TipoContatoMapper implements MapperInterface<TipoContatoEntity, TipoContato> {

    @Override
    public TipoContato fromEntityToModel(TipoContatoEntity entity) {
        return TipoContato.get(entity.getId());
    }

    @Override
    public TipoContatoEntity fromModelToEntity(TipoContato model) {
        return new TipoContatoEntity(model.getId(), model.toString());
    }

    @Override
    public String modelToString(TipoContato model) {
        return "";
    }
}
