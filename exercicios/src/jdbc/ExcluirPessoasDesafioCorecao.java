package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class ExcluirPessoasDesafioCorecao {

	public static void main(String[] args) throws SQLException {

		Pessoa alterarPessoa = new Pessoa();

			Scanner entrada = new Scanner(System.in);

			System.out.println("Infrome o nome a ser Excluido: ");
			alterarPessoa.setNome(entrada.next());

			Connection conexao = Conexao.getConexao();
			String sql = "DELETE FROM pessoas WHERE nome = ?";

			PreparedStatement stmt = conexao.prepareStatement(sql);
			stmt.setString(1, alterarPessoa.getNome());
			
			int contagem = stmt.executeUpdate();
			
			if(contagem > 0) {
				System.out.println("Dados excluidos");
			}else {
				System.out.println("Nada foi Excluido");
			}
			stmt.execute();
			
			System.out.println("Executando.......!");
			System.out.println("Quantidade de linhas afetadas "+ contagem);
			stmt.close();
			conexao.close();
			entrada.close();
			

		
	}

}
