package com.sheiladev.ebambu.negocio.usecase;

public interface SaveUseCase<T> {
    T executar(T object);
}
