package classe;

public class produto {
	
	String nome;
	double preco;
	double desconto;
	
	
	produto (){
		
	}
	produto(String n, double p, double d){
		nome = n;
		 preco = p;
		desconto = d;
		
	}
	 double precoComDesconto( double p, double d) {
		 
		double desconto = (d * p) / 100;
		return desconto;
		
	}
	 

}
