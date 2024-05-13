package com.sheiladev.ebambu.controller;

import com.sheiladev.ebambu.model.Endereco;
import com.sheiladev.ebambu.negocio.usecase.EnderecoFindById;
import jakarta.websocket.server.PathParam;
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

    private final EnderecoFindById findByIdUseCase;

    public EnderecoController(EnderecoFindById findByIdUseCase) {
        this.findByIdUseCase = findByIdUseCase;
    }

    @GetMapping("/{id}")
    public ResponseEntity<Endereco> findById(@PathVariable Long id){
        Optional<Endereco> optional =  findByIdUseCase.executar(id);
        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
