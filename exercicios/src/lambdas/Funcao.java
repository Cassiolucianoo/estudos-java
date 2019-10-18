package lambdas;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {
		
		Function<Integer, String> parOuImpar = 
				numero -> numero % 2 == 0 ? " Par ": " Impar ";
				
		Function<String, String> oResulatadoE = 
				valor -> " o  resuldato é :"+valor;
				
		Function<String, String> empolgado = 
				valor -> valor + "!!!";
				
		Function<String, String>duvidas =
				valor -> valor + "????";
		
		String resultadoFinal = parOuImpar
				.andThen(oResulatadoE)
				.andThen(empolgado)
				.apply(32);
		
		System.out.println(resultadoFinal);
		
		String resultadoFinal2 = parOuImpar
				.andThen(oResulatadoE)
				.andThen(duvidas)
				.apply(33);
		
		System.out.println(resultadoFinal2);
		
		
		System.out.println(parOuImpar.apply(32));
				
		
				

	}

}
