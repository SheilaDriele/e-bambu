package com.sheiladev.ebambu.negocio.usecase.contato;

import com.sheiladev.ebambu.entity.ContatoEntity;
import com.sheiladev.ebambu.mapper.ContatoMapper;
import com.sheiladev.ebambu.model.Contato;
import com.sheiladev.ebambu.negocio.usecase.FindAllUseCase;
import com.sheiladev.ebambu.repository.ContatoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ContatoFindAllUseCase implements FindAllUseCase<Contato> {
    private final ContatoRepository repository;

    public ContatoFindAllUseCase(ContatoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Contato> executar(long limit, long offset) {
        Iterable<ContatoEntity> resultadoConsulta = repository.findAll();

        ContatoMapper mapper = new ContatoMapper();
        List<Contato> contatos = new ArrayList<>();

        for (ContatoEntity contato : resultadoConsulta){
            contatos.add(mapper.fromEntityToModel(contato));
        }
        return contatos;
    }


}
