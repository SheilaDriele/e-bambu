package com.sheiladev.ebambu.repository;

import com.sheiladev.ebambu.entity.CategoriaEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoriaRepository extends CrudRepository<CategoriaEntity, Long> {
}
