package com.github.wezmoreira.springpatterns.repository;

import com.github.wezmoreira.springpatterns.model.Cliente;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {

}