package com.sheiladev.ebambu.negocio.usecase.contato;

import com.sheiladev.ebambu.entity.ContatoEntity;
import com.sheiladev.ebambu.negocio.usecase.SaveUseCase;
import com.sheiladev.ebambu.repository.ContatoRepository;
import org.springframework.stereotype.Service;

@Service
public class ContatoSaveUseCase implements SaveUseCase<ContatoEntity> {

    private final ContatoRepository repository;

    public ContatoSaveUseCase(ContatoRepository repository) {
        this.repository = repository;
    }

    @Override
    public ContatoEntity executar(ContatoEntity entity) {
        return repository.save(entity);
    }
}
