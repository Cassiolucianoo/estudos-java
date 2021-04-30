package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class AlterarPesssoasDesafio2 {

	public static void main(String[] args) {

		Pessoa alterarPessoa = new Pessoa();

		try {
			Scanner entrada = new Scanner(System.in);

			System.out.println("Codigo de alteração: ");
			alterarPessoa.setCodigo(entrada.nextInt());

			System.out.println("Infrome o nome: ");
			alterarPessoa.setNome(entrada.next());

			Connection conexao = Conexao.getConexao();
			String sql = "update pessoas set nome = ? where codigo = ?";

			PreparedStatement stmt = conexao.prepareStatement(sql);

			stmt.setString(1, alterarPessoa.getNome());
			stmt.setInt(2, alterarPessoa.getCodigo());

			stmt.execute();
			System.out.println("Gravado!");

			stmt.close();
			conexao.close();
			entrada.close();

			System.out.println("Alteração realizada !");

		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
}
