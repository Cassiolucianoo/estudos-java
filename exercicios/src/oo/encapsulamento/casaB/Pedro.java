package oo.encapsulamento.casaB;

import oo.encapsulamento.casaA.Ana;

public class Pedro extends Ana {

	
	void testeAcessos() {
		//private String segredo 
		//String facoDentroDeCASA 
		//protected String formaDefalar
		//public String todosSabem 
		
		//Os atributos protegidos s�o acessados via heran�a 
		//n�o via instancia
		//Ana mae = new Ana();
		
		//System.out.println(mae.segredo);
		//System.out.println(mae.facoDentroDeCASA);
		
		System.out.println(formaDefalar);
		System.out.println(todosSabem);
		
	}
	
}
