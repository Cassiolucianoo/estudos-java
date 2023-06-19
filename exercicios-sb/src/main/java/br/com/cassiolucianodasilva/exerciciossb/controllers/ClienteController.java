package br.com.cassiolucianodasilva.exerciciossb.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cassiolucianodasilva.exerciciossb.model.Cliente;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
	
	@GetMapping("/user")
	public Cliente onterCleinte () {
		return new  Cliente( 18, "cassio luciano da silva", "367.532.428.-05");
		
	}
}
