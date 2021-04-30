package oo.polimorfismo.funcionarioHeranca;

public class Gerente extends Funcionario{
	private int senha;
	
	
	
	public int getSenha() {
		return senha;
	}
	public void setSenha(int senha) {
		this.senha = senha;
	}
	public boolean ValiDaSenha(int senha) {
		
		if(this.senha == senha){
			return true;
		}else{
			return false;
		}
	}
	public double geBonificacao(){
		
		return super.getBonificacao() + super.getSalario();
		
	}
}
