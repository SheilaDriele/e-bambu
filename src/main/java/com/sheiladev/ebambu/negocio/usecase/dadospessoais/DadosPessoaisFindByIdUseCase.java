package com.sheiladev.ebambu.negocio.usecase.dadospessoais;

import com.sheiladev.ebambu.entity.DadosPessoaisEntity;
import com.sheiladev.ebambu.model.DadosPessoais;
import com.sheiladev.ebambu.negocio.usecase.FindByIdUseCase;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class DadosPessoaisFindByIdUseCase implements FindByIdUseCase<DadosPessoais> {

    private final DadosPessoaisRepository repository;

    public DadosPessoaisFindByIdUseCase(DadosPessoaisRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<DadosPessoais> executar(Long id) {
        return ((CrudRepository)repository).findById(id);
    }
}
