package br.com.cassiolucianodasilva.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.cassiolucianodasilva.exerciciossb.model.entities.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

	@GetMapping("/user")
	public Cliente onterCleinte() {
		return new Cliente(18, "cassio luciano da silva", "367.532.428.-05");

	}

 	@GetMapping("/{id}")
	public Cliente obterClienteId1(@PathVariable int id) {
		return new Cliente(id, "Luciano cassio  da silva", "890.544.436.-05");

	}

	@GetMapping
	public Cliente obterClienteId2(@RequestParam(name = "id", defaultValue = "1") int id) {
		return new Cliente(id, "cassio silva", "111.544.436.-05");

	}

}
