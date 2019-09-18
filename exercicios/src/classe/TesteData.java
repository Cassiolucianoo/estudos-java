package classe;

public class TesteData {

	public static void main(String[] args) {
		
		data d1 = new data();
		
		

		data d2 = new data(2,"janeiro",2009);
		
		d2.ano = 1999;
		d2.mes = "Abril";
		d2.dia = 14;
		
		data d3 = new data();
		
		d3.ano = 1988;
		d3.mes = "Agosto";
		d3.dia = 22;
		
		//outra forma
		String dataFormatada1 = d3.formatarData1();
		System.out.println(dataFormatada1);
		
		System.out.printf(d1.formatarData(),d1.dia,d1.mes,d1.ano );
		System.out.printf(d2.formatarData1() );
		

	}

}
