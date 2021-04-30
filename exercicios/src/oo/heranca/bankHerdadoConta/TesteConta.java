package oo.heranca.bankHerdadoConta;


public class TesteConta {

	public static void main(String[] args) {
		
		ContaCorrente cc = new ContaCorrente(111, 111);
		cc.deposita(100.0);
		
		ContaPoupanca cp  = new ContaPoupanca(222, 222);
		cp.deposita(200.0);
		
		cc.transfere(10.0, cp);
		
		System.out.println("valor transferido " +cc.getValorTrasa());
		System.out.println("Valor Conta corrente "+cc.getSaldo());
		System.out.println("Valor Conta poupaça "+cp.getSaldo());

	} 
}