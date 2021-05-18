package treinamento;

public class Calcular {
	private int opcao; 
	private int resultado;
	
	public Calcular (){	
	}
	public void calcula(int n1,int n2){
		if( this.opcao == 1){
			this.resultado = n1 + n2 ;
		}else if(this.opcao == 2){
			this.resultado = n1 - n2 ;
		}if(this.opcao == 3){
			this.resultado = n1 * n2 ;
		}else if(this.opcao == 4){
			this.resultado = n1 / n2 ;
		}	
	}
	public int getOpcao() {
		return opcao;
	}
	public void setOpcao(int opcao) {
		this.opcao = opcao;
	}
	public int getResultado() {
		return resultado;
	}
	public void setResultado(int resultado) {
		this.resultado = resultado;
	}

}
