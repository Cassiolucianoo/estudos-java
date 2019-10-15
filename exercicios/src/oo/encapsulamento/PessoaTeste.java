package oo.encapsulamento;

public class PessoaTeste {

	public static void main(String[] args) {
		Pessoa p1 = new Pessoa("cassio ","Luciano",-30);
		
		//lendo e alterando via metodos
		p1.setIdade(300);
		System.out.println(p1.getIdade());//ler valor
		
		System.out.println(p1);//ler valor
		
		System.out.println(p1.getNomeCompleto());//ler valor
	}

}
