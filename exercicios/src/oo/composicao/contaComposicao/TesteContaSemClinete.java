package oo.composicao.contaComposicao;


public class TesteContaSemClinete {

	public static void main(String[] args) {
		Conta contaDoCassio = new Conta();
		
		//chamando methodo
		System.out.println(contaDoCassio.pegaSaldo());
		contaDoCassio.titular = new Cliente();
		
		contaDoCassio.titular.nome = "cassio";
		System.out.println(contaDoCassio.titular.nome);

	}

}
