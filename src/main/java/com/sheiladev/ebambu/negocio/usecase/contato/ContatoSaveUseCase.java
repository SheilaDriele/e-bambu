package com.sheiladev.ebambu.negocio.usecase.contato;

import com.sheiladev.ebambu.entity.ContatoEntity;
import com.sheiladev.ebambu.mapper.ContatoMapper;
import com.sheiladev.ebambu.model.Contato;
import com.sheiladev.ebambu.negocio.usecase.SaveUseCase;
import com.sheiladev.ebambu.repository.ContatoRepository;
import org.springframework.stereotype.Service;

@Service
public class ContatoSaveUseCase implements SaveUseCase<Contato> {

    private final ContatoRepository repository;

    public ContatoSaveUseCase(ContatoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Contato executar(Contato contato) {
        ContatoMapper mapper = new ContatoMapper();
        ContatoEntity retorno = repository.save(mapper.fromModelToEntity(contato));
        return mapper.fromEntityToModel(retorno);
    }
}
