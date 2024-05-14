package com.sheiladev.ebambu.negocio.usecase;

import com.sheiladev.ebambu.entity.EnderecoEntity;
import com.sheiladev.ebambu.mapper.EnderecoMapper;
import com.sheiladev.ebambu.model.Endereco;
import com.sheiladev.ebambu.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class EnderecoFindById implements FindByIdUseCase<Endereco> {

    private final EnderecoRepository repository;

    public EnderecoFindById(EnderecoRepository repository) {
        this.repository = repository;
    }

    @Override
    public Optional<Endereco> executar(Long id) {
        EnderecoMapper mapper = new EnderecoMapper();
        Optional<EnderecoEntity> optional = repository.findById(id);
        return optional.map(o -> mapper.fromEntityToModel(optional.get()));
    }
}
