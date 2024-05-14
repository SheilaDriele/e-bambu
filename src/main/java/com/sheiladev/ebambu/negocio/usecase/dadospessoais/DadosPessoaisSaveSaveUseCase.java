package com.sheiladev.ebambu.negocio.usecase.dadospessoais;

import com.sheiladev.ebambu.entity.DadosPessoaisEntity;
import com.sheiladev.ebambu.mapper.DadosPessoaisMapper;
import com.sheiladev.ebambu.model.DadosPessoais;
import com.sheiladev.ebambu.negocio.usecase.SaveUseCase;
import com.sheiladev.ebambu.repository.DadosPessoaisRepository;
import org.springframework.stereotype.Service;

@Service
public class DadosPessoaisSaveSaveUseCase implements SaveUseCase<DadosPessoais> {

    private final DadosPessoaisRepository repository;

    public DadosPessoaisSaveSaveUseCase(DadosPessoaisRepository repository) {
        this.repository = repository;
    }

    @Override
    public DadosPessoais executar(DadosPessoais dadosPessoais) {
        DadosPessoaisMapper mapper = new DadosPessoaisMapper();
        DadosPessoaisEntity retorno =  repository.save(mapper.fromModelToEntity(dadosPessoais));
        return mapper.fromEntityToModel(retorno);
    }
}
