package com.sheiladev.ebambu.controller;

import com.sheiladev.ebambu.model.DadosPessoais;
import com.sheiladev.ebambu.negocio.usecase.dadospessoais.DadosPessoaisFindByIdUseCase;
import com.sheiladev.ebambu.negocio.usecase.dadospessoais.DadosPessoaisSaveSaveUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.Optional;

@RestController
@RequestMapping("/dados-pessoais")
public class DadosPessoaisEntrypoint {

    private final DadosPessoaisSaveSaveUseCase saveUseCase;
    private final DadosPessoaisFindByIdUseCase findByIdUseCase;

    public DadosPessoaisEntrypoint(DadosPessoaisSaveSaveUseCase saveUseCase, DadosPessoaisFindByIdUseCase findByIdUseCase) {
        this.saveUseCase = saveUseCase;
        this.findByIdUseCase = findByIdUseCase;
    }

    @PostMapping
    public ResponseEntity<DadosPessoais> save(@RequestBody DadosPessoais dadosPessoais){
        DadosPessoais dadosPessoais1 = saveUseCase.executar(dadosPessoais);
        return ResponseEntity.created(URI.create(dadosPessoais1.getNome())).body(dadosPessoais1);
    }

    @GetMapping("/{id}")
    public ResponseEntity<DadosPessoais> findById(@PathVariable Long id){
        Optional<DadosPessoais> optional  = findByIdUseCase.executar(id);
        return optional.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
//        return ResponseEntity.ok(new DadosPessoais("Flávio", LocalDate.now(), Genero.MASCULINO, "0000000"));
    }
}
