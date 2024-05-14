package com.sheiladev.ebambu.mapper;

import com.sheiladev.ebambu.entity.EnderecoEntity;
import com.sheiladev.ebambu.model.Endereco;

public class EnderecoMapper implements MapperInterface<EnderecoEntity, Endereco> {
    @Override
    public Endereco fromEntityToModel(EnderecoEntity entity) {
        TipoEnderecoMapper mapper = new TipoEnderecoMapper();
        return new Endereco(
                mapper.fromEntityToModel(entity.getTipo()),
                entity.getLogradouro(),
                entity.getCep(),
                entity.getNumero(),
                entity.getComplemento(),
                entity.getBairro());
    }

    @Override
    public EnderecoEntity fromModelToEntity(Endereco model) {
        return null;
    }

    @Override
    public String modelToString(Endereco model) {
        return model.toString();
    }
}
