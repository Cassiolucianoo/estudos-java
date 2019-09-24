package classe;

public class ValorVsReferencia {

	public static void main(String[] args) {

		double a = 2;
		double b = a;
		
		a++;
		b--;
		
		System.out.println(a + "" + b);
		
		Data d1 = new Data(1, "",2022);
		Data d2 = d1; // atribuição por referencia ( objeto |)
		
		d1.dia = 31;
		d2.mes =  "setembro";
		d1.ano = 2025;
		
		System.out.println(d1.formatarData1());
		System.out.println(d2.formatarData1());
		
		voltarDataParaValorPao(d1);
	
	}
	static void voltarDataParaValorPao (Data d) {
		d.dia = 1;
		d.mes = "Setembro";
		d.ano = 1988;
		
	}
	static void voltarDataParaValorPao (int a) {
		a++;
	}
}
