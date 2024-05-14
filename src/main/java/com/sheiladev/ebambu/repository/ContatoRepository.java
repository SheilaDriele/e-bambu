package com.sheiladev.ebambu.repository;

import com.sheiladev.ebambu.entity.ContatoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends CrudRepository<ContatoEntity, Long> {
}
