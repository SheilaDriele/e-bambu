package com.sheiladev.ebambu.controller;

import com.sheiladev.ebambu.entity.CategoriaEntity;
import com.sheiladev.ebambu.repository.CategoriaRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CategoriaController {
    private final CategoriaRepository repository;

    public CategoriaController(CategoriaRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/categorias")
    CategoriaEntity novaCategoria(@RequestBody CategoriaEntity novaCategoria) {
        return repository.save(novaCategoria);
    }

    @GetMapping("/categorias")
    Iterable<CategoriaEntity> all() {
        return repository.findAll();
    }
}
