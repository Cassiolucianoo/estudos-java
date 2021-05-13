package funcionario_heranca;

public class Teste_Funcionario {

	public static void main(String[] args) {
		
		Gerente  gerente = new Gerente();
		gerente.setNome("cassio luciano da silva");
		//gerente.setSenha(2222);
		
		System.out.println(gerente.getNome());
		
		gerente.setSenha(1234);
		boolean autenticou = gerente.ValiDaSenha(1235);
		System.out.println(autenticou);
		System.out.println(gerente.getSenha());
		
	}

}
