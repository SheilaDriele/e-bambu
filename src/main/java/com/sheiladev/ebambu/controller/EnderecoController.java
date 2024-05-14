package com.sheiladev.ebambu.controller;

import com.sheiladev.ebambu.model.Endereco;
import com.sheiladev.ebambu.negocio.usecase.endereco.EnderecoFindAllUseCase;
import com.sheiladev.ebambu.negocio.usecase.endereco.EnderecoFindByIdUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/enderecos")
public class EnderecoController {

    private final EnderecoFindByIdUseCase findByIdUseCase;
    private final EnderecoFindAllUseCase findAllUseCase;

    public EnderecoController(EnderecoFindByIdUseCase findByIdUseCase, EnderecoFindAllUseCase findAllUseCase) {
        this.findByIdUseCase = findByIdUseCase;
        this.findAllUseCase = findAllUseCase;
    }

    @GetMapping
    public ResponseEntity<List<Endereco>> findAll(){
        List<Endereco> enderecos = findAllUseCase.executar(0,0);
        return ResponseEntity.ok(enderecos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> findById(@PathVariable Long id) {
        Optional<Endereco> optional = findByIdUseCase.executar(id);
        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
