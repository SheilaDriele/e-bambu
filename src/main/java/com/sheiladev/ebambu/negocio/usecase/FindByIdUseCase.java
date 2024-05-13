package com.sheiladev.ebambu.negocio.usecase;

import java.util.Optional;

public interface FindByIdUseCase<T>{
    Optional<T> executar(Long id);
}
