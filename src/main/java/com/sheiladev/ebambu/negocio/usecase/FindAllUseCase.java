package com.sheiladev.ebambu.negocio.usecase;

import java.util.List;

public interface FindAllUseCase<T> {
    List<T> executar(long limit, long offset);
}
