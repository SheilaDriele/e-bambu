package com.sheiladev.ebambu.controller;

import com.sheiladev.ebambu.model.DadosPessoais;
import com.sheiladev.ebambu.negocio.usecase.dadospessoais.DadosPessoaisSaveUseCase;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.net.URI;

@RestController
@RequestMapping("/dados-pessoais")
public class DadosPessoaisEntrypoint {

    private final DadosPessoaisSaveUseCase saveUseCase;

    public DadosPessoaisEntrypoint(DadosPessoaisSaveUseCase saveUseCase) {
        this.saveUseCase = saveUseCase;
    }

    @PostMapping
    public ResponseEntity<DadosPessoais> save(DadosPessoais dadosPessoais){
        DadosPessoais dadosPessoais1 = saveUseCase.executar(dadosPessoais);
        return ResponseEntity.created(URI.create(dadosPessoais1.getNome())).body(dadosPessoais1);
    }
}
