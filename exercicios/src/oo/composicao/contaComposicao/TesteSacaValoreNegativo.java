package oo.composicao.contaComposicao;


public class TesteSacaValoreNegativo {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.deposita(200);
		System.out.println(conta.saca(300));
		
		//System.out.println("Saldo atual é = "+conta.saldo);
		//conta.saldo -= 150;
		System.out.println(conta.pegaSaldo());
				
	}

}
