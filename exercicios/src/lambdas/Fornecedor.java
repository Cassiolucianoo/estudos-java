package lambdas;


import java.util.Arrays;
import java.util.function.Supplier;

public class Fornecedor {

	public static void main(String[] args) {
		Supplier<Object> umLista = 
				() -> Arrays.asList("Zé", "Buda", "Santo","Jeova","mario");
				
	    System.out.println(umLista.get());

	}

}
