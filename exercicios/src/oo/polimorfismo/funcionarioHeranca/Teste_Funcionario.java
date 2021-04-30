package oo.polimorfismo.funcionarioHeranca;

public class Teste_Funcionario {

	public static void main(String[] args) {
		
		Gerente  gerente = new Gerente();
		gerente.setNome("cassio luciano da silva");
		gerente.setSalario(5010.0);
		
		System.out.println(gerente.getNome());
		
		gerente.setSenha(1234);
		boolean autenticou = gerente.ValiDaSenha(222222);
		System.out.println(autenticou);
		System.out.println(gerente.getSenha());
		
		System.out.println(gerente.geBonificacao());
		
	}

}
