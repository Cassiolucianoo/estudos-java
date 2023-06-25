package br.com.cassiolucianodasilva.exerciciossb.controllers;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	// Simplificando recebendo o objeto como parametros par simplificar e passando
	// para save

	//@PostMapping
	@RequestMapping(method = {RequestMethod.POST, RequestMethod.PUT})
	public @ResponseBody Produto novoProdutos(@Valid Produto produto) {
		produtoRepository.save(produto);
		return produto;

	}

	@GetMapping
	public Iterable<Produto> obterProdutos() {
		return produtoRepository.findAll();
	}
	
	@GetMapping(path="/{id}")
	public Optional<Produto> obterProdutoId(@PathVariable int id){
		return produtoRepository.findById(id);
	}
	
//	@PutMapping
//	public Produto AlterarProduto(Produto produto) {
//		produtoRepository.save(produto);
//		return produto;
//	}
	
	@DeleteMapping(path = "/{id}")
	public void excluirProduto(@PathVariable int id) {
		produtoRepository.deleteById(id);
	}
}
