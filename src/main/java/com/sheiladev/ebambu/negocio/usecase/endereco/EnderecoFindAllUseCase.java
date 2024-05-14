package com.sheiladev.ebambu.negocio.usecase.endereco;

import com.sheiladev.ebambu.entity.EnderecoEntity;
import com.sheiladev.ebambu.mapper.EnderecoMapper;
import com.sheiladev.ebambu.model.Endereco;
import com.sheiladev.ebambu.negocio.usecase.FindAllUseCase;
import com.sheiladev.ebambu.repository.EnderecoRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EnderecoFindAllUseCase implements FindAllUseCase<Endereco> {
    private final EnderecoRepository repository;

    public EnderecoFindAllUseCase(EnderecoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Endereco> executar(long limit, long offset) {
        Iterable<EnderecoEntity> resultadoConsulta = repository.findAll();

        EnderecoMapper mapper = new EnderecoMapper();
        List<Endereco> enderecos = new ArrayList<>();

        for(EnderecoEntity endereco : resultadoConsulta){
            enderecos.add(mapper.fromEntityToModel(endereco));
        }
        return enderecos;
    }
}
