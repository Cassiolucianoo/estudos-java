package br.com.cassiolucianodasilva.exerciciossb.outros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
	
	@RequestMapping(method = RequestMethod.GET, path = "/ola")
	public String ola() {
		return "Olá Spring Boot !";
	}
	
	@GetMapping( "/ola1")
	public String ola1() {
		return "1 Olá Spring Boot  !";
	}
	
	@GetMapping( "/ola2")
	public String ola2() {
		return " 2  Olá Spring Boot !";
	}
	
	@GetMapping( path = {"/ola2" , "/saudacao"})
	public String ola3() {
		return " 3  Olá Spring Boot com array!";
	}

}
