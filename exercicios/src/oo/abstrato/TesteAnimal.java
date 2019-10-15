package oo.abstrato;

public class TesteAnimal {

	public static void main(String[] args) {
		
		Mamifero dog = new Cachorro();
		System.out.println(dog.mover());
		System.out.println(dog.mamar());
		System.out.println(dog.respirar());
		

	}

}
