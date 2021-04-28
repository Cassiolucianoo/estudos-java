package jdbc;

public class Pessoa {

	private int codigo;
	private String nome;
	private String sobrenome;
	private int idade;

	public Pessoa(int codigo, String nome, String sobrenome, int idade) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.idade = idade;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
