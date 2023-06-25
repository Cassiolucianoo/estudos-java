package br.com.cassiolucianodasilva.exerciciossb.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;

import br.com.cassiolucianodasilva.exerciciossb.model.entities.Produto;

//Declaração da interface ProdutoRepository

//public interface ProdutoRepository extends CrudRepository<Produto, Integer> {
//
//}

public interface ProdutoRepository extends PagingAndSortingRepository<Produto, Integer> {

}