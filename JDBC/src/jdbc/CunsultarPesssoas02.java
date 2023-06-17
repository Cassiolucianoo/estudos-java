package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CunsultarPesssoas02 {

	public static void main(String[] args) throws SQLException {
		
		String nomePesquisa = null;
		Scanner entrada = new Scanner(System.in);

		System.out.println("Infrome O nome: ");
		nomePesquisa = entrada.next();

		Connection conexao = Conexao.getConexao();
		String sql = "SELECT * FROM pessoas where nome like ?";

		PreparedStatement stmt = conexao.prepareStatement(sql);
		stmt.setString(1, "%"+ nomePesquisa +"%");
		
		//resultados do banco de dados para o java
		ResultSet resultado = stmt.executeQuery();

		List<Pessoa> pessoas = new ArrayList<>();

		
		//O metodo next ele retorna um valor true ou false então ele anda na linsta até que retorne um false
		while (resultado.next()) {

			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			String sobrenome = resultado.getString("sobre_nome");
			int idade = resultado.getInt("idade");
			
            // com todos os atributos do banco foi criado uma pessoa
			pessoas.add(new Pessoa(codigo, nome, sobrenome, idade));
		}
        // aqui estou percorrendo a lista pessoas
		for (Pessoa p : pessoas) {
			System.out.println("Codi : " + p.getCodigo() + "\n" + "Nome :" + p.getNome() + " " + p.getSobrenome() + "\n"
					+ "Idade :" + p.getIdade() + "\n");
		}
		
		stmt.close();
		conexao.close();
		entrada.close();
	}

}
