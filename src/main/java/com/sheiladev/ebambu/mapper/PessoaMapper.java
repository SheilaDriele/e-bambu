package com.sheiladev.ebambu.mapper;

import com.sheiladev.ebambu.entity.PessoaEntity;
import com.sheiladev.ebambu.model.Pessoa;

public class PessoaMapper {

    public static Pessoa fromEntityToModel(PessoaEntity entity){
        return new Pessoa();
    }
}
