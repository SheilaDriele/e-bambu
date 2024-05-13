package com.sheiladev.ebambu.mapper;

public interface MapperInterface<T,K> {

    K fromEntityToModel(T entity);

    T fromModelToEntity(K model);

    String modelToString(K model);
}
