package com.sheiladev.ebambu.controller;

import com.sheiladev.ebambu.model.Contato;
import com.sheiladev.ebambu.negocio.usecase.contato.ContatoFindAllUseCase;
import com.sheiladev.ebambu.negocio.usecase.contato.ContatoFindByIdUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contatos")
public class ContatoController {

    private final ContatoFindByIdUseCase findByIdUseCase;
    private final ContatoFindAllUseCase findAllUseCase;


    public ContatoController(ContatoFindByIdUseCase findByIdUseCase, ContatoFindAllUseCase findAllUseCase) {
        this.findByIdUseCase = findByIdUseCase;
        this.findAllUseCase = findAllUseCase;
    }

    @GetMapping
    public ResponseEntity<List<Contato>> findAll(){
        List<Contato> contatos = findAllUseCase.executar(0,0);
        return ResponseEntity.ok(contatos);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contato> findById(@PathVariable Long id) {
        Optional<Contato> optional = findByIdUseCase.executar(id);
        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
