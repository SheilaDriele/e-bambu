package com.sheiladev.ebambu.negocio.usecase.contato;

import com.sheiladev.ebambu.entity.ContatoEntity;
import com.sheiladev.ebambu.mapper.ContatoMapper;
import com.sheiladev.ebambu.model.Contato;
import com.sheiladev.ebambu.negocio.usecase.FindByIdUseCase;
import com.sheiladev.ebambu.repository.ContatoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ContatoFindByIdUseCase implements FindByIdUseCase<Contato> {

    private final ContatoRepository repository;

    public ContatoFindByIdUseCase(ContatoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Contato> executar(Long id) {
        ContatoMapper mapper = new ContatoMapper();
        Optional<ContatoEntity> optional = repository.findById(id);
        return optional.map(o -> mapper.fromEntityToModel(optional.get()));
    }
}
