package com.sheiladev.ebambu.mapper;

import com.sheiladev.ebambu.entity.TipoEnderecoEntity;
import com.sheiladev.ebambu.enumeradores.TipoEndereco;

public class TipoEnderecoMapper implements MapperInterface<TipoEnderecoEntity, TipoEndereco> {
    @Override
    public TipoEndereco fromEntityToModel(TipoEnderecoEntity entity) {
        return TipoEndereco.get(entity.getId());
    }

    @Override
    public TipoEnderecoEntity fromModelToEntity(TipoEndereco model) {
        return new TipoEnderecoEntity(model.getId(), model.toString());
    }

    @Override
    public String modelToString(TipoEndereco model) {
        return "";
    }
}
