package oo.polimorfismo.funcionarioHeranca;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario cassio = new Funcionario();
		cassio.setNome("cassio");
		cassio.setCpf("22222222229");
		cassio.setSalario(2600.00);
		
		System.out.println(cassio.getNome());
		System.out.println(cassio.getBonificacao());
		System.out.println(cassio.getSalario() + cassio.getBonificacao());
		
		//nico.salario = 300.0;

	}

}
