package classe;

public class Data {
	String mes;
	int ano;
	int dia;
	String texto;

	Data (){
		//this.mes = "janeiro";
		//this.ano = 1977;
		//this.dia = 1;
		
		this(1 , "setembro", 1970);
	}
	
	 Data( int d , String m,int a ) {
		this.mes = m;
		this.ano = a;
		this.dia = d;
		
	}
	String formatarData() {
		
		this.texto = "Data = %d / %s / %d \n";
		return this.texto;
		
	}
	//correção
	String formatarData1() {
		return String.format("Data = %d / %s / %d ",this.dia,this.mes,this.ano);	
		
	}
}
