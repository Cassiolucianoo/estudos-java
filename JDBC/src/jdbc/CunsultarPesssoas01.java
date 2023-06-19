package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CunsultarPesssoas01 {

	public static void main(String[] args) throws SQLException {

		Connection conexao = Conexao.getConexao();
		String sql = "SELECT * FROM pessoas";

		Statement stmt = conexao.createStatement();
		
		//resultados do banco de dados para o java
		ResultSet resultado = stmt.executeQuery(sql);

		List<Pessoa> pessoas = new ArrayList<>();

		
		//O metodo next ele retorna um valor true ou false ent�o ele anda na linsta at� que retorne um false
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
	}

}
