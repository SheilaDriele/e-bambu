package com.sheiladev.ebambu.controller;

import com.sheiladev.ebambu.entity.DadosPessoaisEntity;
import com.sheiladev.ebambu.model.DadosPessoais;
import com.sheiladev.ebambu.negocio.usecase.dadospessoais.DadosPessoaisFindByIdUseCase;
import com.sheiladev.ebambu.negocio.usecase.dadospessoais.DadosPessoaisSaveUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/dados-pessoais")
public class DadosPessoaisEntrypoint {

    private final DadosPessoaisSaveUseCase saveUseCase;
    private final DadosPessoaisFindByIdUseCase findByIdUseCase;

    public DadosPessoaisEntrypoint(DadosPessoaisSaveUseCase saveUseCase, DadosPessoaisFindByIdUseCase findByIdUseCase) {
        this.saveUseCase = saveUseCase;
        this.findByIdUseCase = findByIdUseCase;
    }

    @PostMapping
    public ResponseEntity<DadosPessoais> save(DadosPessoais dadosPessoais){
        DadosPessoais dadosPessoais1 = saveUseCase.executar(dadosPessoais);
        return ResponseEntity.created(URI.create(dadosPessoais1.getNome())).body(dadosPessoais1);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosPessoais> findById(@PathVariable Long id){
        Optional<DadosPessoais> optional  = findByIdUseCase.executar(id);
        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }
}
