package fundamentos;

public class TiposPrimitivos {

	public static void main(String[] args) {
		// Tipos num�ricos inteiros
		byte anosDeEmpresa = 23;
		short numeroDevoos = 542;
		int id = 56789;
		long pontosAcumulados = 3_134_845_223L;
		
		//	Tipos num�ricos reais 
		float salario = 11_445.44F;
		double vendasAcumuladas = 2_991_797_103.01;
		
		//Tipo booleano 
		boolean estaDeFerias = false;//true 
		
		//tipo caractere 
		char status = 'A'; //ativo
		
		//Dias de empresa
		System.out.println(anosDeEmpresa * 365);
		
		//Numero de viagens
		System.out.println(numeroDevoos / 2);
		
		//pontos por real 
		System.out.println(pontosAcumulados / vendasAcumuladas);
		
		System.out.println(id + " : ganha -> "+ salario);
		System.out.println("F�rias "+ estaDeFerias);
		System.out.println("Status "+status);

	}

}
