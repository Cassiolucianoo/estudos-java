package fundamentos;

public class TipoString {

	public static void main(String[] args) {
		
		//pega a posição 2 da String 0 - 1 - 2
		System.out.println("Olá pessoal".charAt(2));
		
	
		String s = "Boa tarde";
		System.out.println(s.concat("!!!"));	//concat de String
		
		s = s.toUpperCase(); //Vai deixar MAISCULO STRING de S
		System.out.println(s.concat("!!!"));
		
		System.out.println(s + "!!!"); 	//concat de String mesma forma com +
		
		//validar de s é Boa ou boa 
		System.out.println(s.startsWith("Boa"));
		System.out.println(s.startsWith("boa"));
		
		//como es´ta em maisculo 
		System.out.println(s.startsWith("BOA"));
		
		//pega a string e converte pra minusculo e compara
		System.out.println(s.toLowerCase().startsWith("boa"));
		
		//converete de minusculo para maisculo e compara 
		System.out.println(s.toUpperCase().startsWith("TARDE"));
		
		//conta caracteres
		System.out.println(s.length() -1 );
		
		//comparação de igualdade 
		System.out.println(s.equals("boa tarde"));
		
		//ignora se é maisculo ou minusculo
		System.out.println(s.equalsIgnoreCase("bOa TaRde"));
		
		var nome = "CASSIO";
		var sobrenome = "Luciano";
		var idade = 33;
		var salario = 12345.987;
		
		String maisUmaFrase = "nome: "+nome + "\nSobrenome: "
				+sobrenome+"\n Idade: "
				+idade+ "\nSalario: "
				+salario+"\n\n";
		System.out.println(maisUmaFrase);
		
		System.out.printf("Você %s %s Tem %d anos e O salario R$ %.2f.",
				nome, sobrenome , idade, salario);
		
		String frase = String.format("Você %s %s Tem %d anos e O salario R$ %.2f.",
				nome, sobrenome , idade, salario);
		
		System.out.println(frase);
		
		
		
		
		
		
		
	}

}
