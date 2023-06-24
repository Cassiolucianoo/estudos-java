package br.com.cassiolucianodasilva.exerciciossb.controllers;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.cassiolucianodasilva.exerciciossb.model.entities.Produto;
import br.com.cassiolucianodasilva.exerciciossb.model.repositories.ProdutoRepository;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoController {

	// private final ProdutoRepository produtoRepository;

	// public ProdutoController(ProdutoRepository produtoRepository) {
	// this.produtoRepository = produtoRepository;
	// }

	 @Autowired
	private ProdutoRepository produtoRepository;

//	@PostMapping
//	public @ResponseBody Produto novoProdutos(@RequestParam String nome,
//			@RequestParam Float preco, @RequestParam float desconto) {
//
//		Produto produto = new Produto(nome, preco, desconto);
//		produtoRepository.save(produto);
//		return produto;
//
//	}

	// Simplificando recebendo o objeto como parametros par simplificar e passando para save

	 @PostMapping
		public @ResponseBody Produto novoProdutos(@Valid Produto produto) {
			produtoRepository.save(produto);
			return produto;

		}
	  
}
