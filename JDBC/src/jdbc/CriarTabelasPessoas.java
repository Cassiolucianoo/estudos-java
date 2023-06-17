package jdbc;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarTabelasPessoas {

	public static void main(String[] args) throws SQLException {
		Connection conexao = Conexao.getConexao();  
		
		//Java 13 text blocks ( Preview )
		
		String sql = "CREATE TABLE IF NOT EXISTS pessoas("
				+ "codigo INT AUTO_INCREMENT PRIMARY KEY,"
				+ "nome VARCHAR(80) NOT NULL,"
				+ "sobre_nome VARCHAR(80) NOT NULL,"
				+ "idade int(3)"
				+")";
		
		Statement stmt = conexao.createStatement();
		stmt.execute(sql);
		
		System.out.println("Tabela criada com sucesso!");
		conexao.close();
		

	}

}
