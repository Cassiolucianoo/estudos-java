package jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CunsultarPesssoasDesafio {

	public static void main(String[] args) throws SQLException {

		String nomeinformado;
		int quantUser = 0;

		// A Scannerclasse é usada para obter a entrada do usuário e é encontrada no
		// java.utilpacote.
		Scanner entrada = new Scanner(System.in);

		System.out.println("Infrome O nome: ");
		nomeinformado = entrada.next();

		Connection conexao = Conexao.getConexao();
		String sql = "SELECT * FROM pessoas where (nome) like ('" + nomeinformado + "')";

		Statement stmt = conexao.createStatement();

		// resultados do banco de dados para o java
		ResultSet resultado = stmt.executeQuery(sql);

		List<Pessoa> pessoas = new ArrayList<>();

		// O metodo next ele retorna um valor true ou false então ele anda na linsta até
		// que retorne um false
		while (resultado.next()) {

			int codigo = resultado.getInt("codigo");
			String nome = resultado.getString("nome");
			String sobrenome = resultado.getString("sobre_nome");
			int idade = resultado.getInt("idade");

			// com todos os atributos do banco foi criado uma pessoa
			pessoas.add(new Pessoa(codigo, nome, sobrenome, idade));

			quantUser = quantUser + 1;

		}
		// aqui estou percorrendo a lista pessoas
		for (Pessoa p : pessoas) {

			System.out.println("Codi : " + p.getCodigo() + "\n" + "Nome :" + p.getNome() + " " + p.getSobrenome() + "\n"
					+ "Idade :" + p.getIdade() + "\n");

		}
		
        System.out.println("Pessoas encontradas na tabela =  "+ quantUser);
        
		stmt.close();
		conexao.close();
		entrada.close();

	}

}
