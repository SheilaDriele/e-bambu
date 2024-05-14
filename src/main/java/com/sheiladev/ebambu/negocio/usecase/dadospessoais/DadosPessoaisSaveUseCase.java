package com.sheiladev.ebambu.negocio.usecase.dadospessoais;

import com.sheiladev.ebambu.mapper.DadosPessoaisMapper;
import com.sheiladev.ebambu.model.DadosPessoais;
import com.sheiladev.ebambu.negocio.usecase.UseCase;
import com.sheiladev.ebambu.repository.DadosPessoaisRepository;
import org.springframework.stereotype.Service;

@Service
public class DadosPessoaisSaveUseCase implements UseCase<DadosPessoais> {

    private final DadosPessoaisRepository repository;

    public DadosPessoaisSaveUseCase(DadosPessoaisRepository repository) {
        this.repository = repository;
    }

    @Override
    public DadosPessoais executar(DadosPessoais dadosPessoais) {
        DadosPessoaisMapper mapper = new DadosPessoaisMapper();
        return repository.save(mapper.fromModelToEntity(dadosPessoais));
    }
}
