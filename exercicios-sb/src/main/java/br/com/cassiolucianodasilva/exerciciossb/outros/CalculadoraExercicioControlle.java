package br.com.cassiolucianodasilva.exerciciossb.outros;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/calculadora")
public class CalculadoraExercicioControlle {
	
	
	// /calculadora/soma/10/20  
	
	@GetMapping("/somar")
	public int CalculaSoma () {
		
		 int a = 10; 
		 int b = 20;
		 
		return a + b ;
	}
	// forma que vai adicionar na url os parametros
	// /calculadora/subtrair?a=100&b=39
	@GetMapping ("/subtrair")
	public int CalculaSobtracao (
			 @RequestParam(name = "a" )int a,
			 @RequestParam(name = "b" )int b) {
		return a - b;
		
	}
	
	// /calculadora/soma/10/20        ----- correção
	
	@GetMapping("/somarcorecao/{a}/{b}")
	public int CalculaSomacorecao (@PathVariable int a, @PathVariable int b) {
		
		return a + b ;
	}
	

}


