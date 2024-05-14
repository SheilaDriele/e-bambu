package com.sheiladev.ebambu.repository;

import com.sheiladev.ebambu.entity.EnderecoEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<EnderecoEntity, Long> {
}
