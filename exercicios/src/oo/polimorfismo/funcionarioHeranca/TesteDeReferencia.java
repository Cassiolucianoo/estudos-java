package oo.polimorfismo.funcionarioHeranca;



public class TesteDeReferencia {

	public static void main(String[] args) {
		//....
		Funcionario gerente = new Gerente();
		
		gerente.setNome("cassio, fazendo teste de polimorfismo. referencia");
		String nome = gerente.getNome();
		
		//não funciona porque a clase de referencia não é a gerente e sim funcionarios 
		//gerente.setValiDaSenha(2222);
		System.out.println(nome);
		
	}

}
