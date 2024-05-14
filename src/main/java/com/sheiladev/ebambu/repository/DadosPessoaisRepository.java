package com.sheiladev.ebambu.repository;

import com.sheiladev.ebambu.entity.DadosPessoaisEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DadosPessoaisRepository extends CrudRepository<DadosPessoaisEntity, Long> {
}
