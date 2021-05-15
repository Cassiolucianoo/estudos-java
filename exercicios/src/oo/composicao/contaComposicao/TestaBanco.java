package oo.composicao.contaComposicao;


public class TestaBanco {

	public static void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "paulinho guerreiro";
		paulo.cpf = "222.222.222 - 22";
		paulo.profissao = "peogramador jr";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		//composição java associa paulo com a conta paulo
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular.cpf);
		System.out.println(contaDoPaulo.titular.profissao);
	}

}
