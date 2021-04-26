package oo.encapsulamento;

public class Pessoa {
	private int idade;
	private String nome;
	private String sobreNome;
	
	
	//construtor com os atributos
	public Pessoa(String nome,String sobreNome, int idade) {
		setNome(nome);
		setSobreNome(sobreNome);
		setIdade(idade);
		
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobreNome() {
		return sobreNome;
	}
	
	public String getNomeCompleto() {
		return getNome()+" "+getSobreNome();
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}


	//Getter ler
	public int getIdade() {
		return idade;
	}
	
	//Setter altera
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 120) {
		this.idade = novaIdade;
		}

	}
	
	@Override
	public String toString() {
		return "Olá eu sou o "+getNome()
		+"Tenho "+getIdade()+" Anos";
	}
	
	
}
