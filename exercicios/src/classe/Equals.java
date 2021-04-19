package classe;

public class Equals {

	public static void main(String[] args) {
		
		
		
		//objeto 1
		Usuario u1 = new Usuario();
		u1.email = "cassiolucianodasilva@mail.com";
		u1.nome = "cassio";
		
		//objeto 2
		Usuario u2 = new Usuario();
		u2.email = "taniakalit@mail.com";
		u2.nome = "tania";
		
		System.out.println(u1 == u2);
		System.out.println(u1.equals(u2));
		System.out.println(u2.equals(u1));
		
		//System.out.println(u2.equals(new Data()));
		
		
	}

}
