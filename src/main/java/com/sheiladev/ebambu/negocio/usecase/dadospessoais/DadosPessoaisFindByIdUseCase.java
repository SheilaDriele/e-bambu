package com.sheiladev.ebambu.negocio.usecase.dadospessoais;

import com.sheiladev.ebambu.model.DadosPessoais;
import com.sheiladev.ebambu.negocio.usecase.FindByIdUseCase;
import com.sheiladev.ebambu.repository.DadosPessoaisRepository;
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
        return repository.findById(id);
    }
}
