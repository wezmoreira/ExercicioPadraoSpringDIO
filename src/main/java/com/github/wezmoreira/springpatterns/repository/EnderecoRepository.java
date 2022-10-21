package com.github.wezmoreira.springpatterns.repository;

import com.github.wezmoreira.springpatterns.model.Endereco;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EnderecoRepository extends CrudRepository<Endereco, String> {

}