package com.sheiladev.ebambu.negocio.usecase;

public interface UseCase<T> {
    T executar(T object);
}
