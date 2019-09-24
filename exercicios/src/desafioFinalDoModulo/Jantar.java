package desafioFinalDoModulo;

public class Jantar {

	public static void main(String[] args) {
		Comida prato1 = new Comida("File de frango",0.2);
		Comida prato2 = new Comida("Big Mc",0.700);
		Comida prato3 = new Comida("Pf completo",3);
		
		Pessoa ser1 = new Pessoa("cassio",71);
		Pessoa ser2 = new Pessoa("Lucas",58);
		Pessoa ser3 = new Pessoa("Pedro",81);
		
		
		//arrumar criar um mehodo para esses testos

		System.out.println("Atual estado pessoa = "+ser1.pessoa+ " \nPeso "+ser1.peso);
		System.out.println("\nPrato = "+prato1.nomeComida+" \nPeso "+prato1.pesoComida);
		
		System.out.println("Ao se alimentar de mais = "+ser1.pessoa+ ""
				+ " \nPeso "+ser1.seAlimentar(prato1.pesoComida +prato2.pesoComida ));
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("\nAtual estado pessoa = "+ser2.pessoa+ " \nPeso "+ser2.peso);
		System.out.println("\nPrato = "+prato2.nomeComida+" \nPeso "+prato2.pesoComida);
		
		System.out.println("Ao se alimentar de mais = "+ser2.pessoa+ ""
				+ " \nPesando "+ser2.seAlimentar(prato2.pesoComida));
		
		System.out.println("-------------------------------------------------------------");
		System.out.println("\nAtual estado pessoa = "+ser3.pessoa+ " \nPeso "+ser3.peso);
		System.out.println("\nPrato = "+prato2.nomeComida+" \nPeso "+prato2.pesoComida);
		
		System.out.println("Ao se alimentar de mais = "+ser3.pessoa+ ""
				+ " \nPesando "+ser3.seAlimentar(prato3.pesoComida));
	}

}
