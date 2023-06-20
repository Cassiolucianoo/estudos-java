package br.com.cassiolucianodasilva.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;

import br.com.cassiolucianodasilva.exerciciossb.model.entities.Produto;

//Declaração da interface ProdutoRepository

public interface ProdutoRepository extends CrudRepository<Produto, Integer> {

}
