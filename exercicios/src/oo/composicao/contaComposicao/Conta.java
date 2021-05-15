package oo.composicao.contaComposicao;

public class Conta {
	private double saldo;
	int numeroConta;
	Cliente titular ;
	int agencia;
	
	//meto sem retorno
	public void deposita(double valor ){
		this.saldo = this.saldo + valor;
	}
	
	//metodo com retorno saca 
	public boolean saca (double valor ){
		if(this.saldo >= valor){
		 this.saldo = this.saldo - valor;
			return true;
		}
			return false;
	}
	
	//transfere valor 
	public boolean transfere (double valor, Conta destino ){
			
		if( this.saldo >= valor){
			this.saldo -= valor;
			destino.deposita(valor);
			return true;
		}
		return false;
	}
	
	public double pegaSaldo(){
		return this.saldo;
		
	}
	
	
}
