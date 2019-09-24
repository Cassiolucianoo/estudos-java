package classe;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	
	Produto (){
		
	}
	Produto(String n, double p, double d){
		nome = n;
		 preco = p;
		desconto = d;
		
	}
	 double precoComDesconto() {
		 
		return preco * (1 - desconto);
		
	}
	
	 double precoComDesconto(double descontoDoGerente) {
		 
		return preco * (1 - desconto + descontoDoGerente);
		
	}
	
	 

}
