package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import java.util.Scanner;

public class ExcluirPesssoasDesafio {

	public static void main(String[] args) throws SQLException {

		Pessoa alterarPessoa = new Pessoa();

			Scanner entrada = new Scanner(System.in);

			System.out.println("Infrome o nome a ser Excluido: ");
			alterarPessoa.setNome(entrada.next());

			Connection conexao = Conexao.getConexao();
			
			String sql = "DELETE FROM pessoas WHERE nome = ?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
         
			stmt.setString(1, alterarPessoa.getNome());
			
			stmt.execute();
			System.out.println("Executando.......!");

			stmt.close();
			conexao.close();
			entrada.close();

			System.out.println("Deletado com sucesso !");

		
	}
}
