package com.sheiladev.ebambu.negocio.usecase.dadospessoais;

import com.sheiladev.ebambu.model.DadosPessoais;
import com.sheiladev.ebambu.negocio.usecase.UseCase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class DadosPessoaisSaveUseCase implements UseCase<DadosPessoais> {

    private final DadosPessoaisRepository repository;

    public DadosPessoaisSaveUseCase(DadosPessoaisRepository repository) {
        this.repository = repository;
    }

    @Override
    public DadosPessoais executar(DadosPessoais dadosPessoais) {
        return ((CrudRepository)repository).save(dadosPessoais);
    }
}
