package classe;

public class data {
	String mes;
	int ano;
	int dia;
	String texto;

	data (){
		mes = "janeiro";
		ano = 1977;
		dia = 1;
	}
	
	 data( int d , String m,int a ) {
		mes = m;
		ano = a;
		dia = d;
		
	}
	String formatarData() {
		
		this.texto = "Data = %d / %s / %d \n";
		return this.texto;
		
	}
	//correção
	String formatarData1() {
		return String.format("Data = %d / %s / %d ",dia,mes,ano);	
		
	}
}
