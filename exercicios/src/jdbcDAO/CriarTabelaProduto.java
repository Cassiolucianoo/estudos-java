package jdbcDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class CriarTabelaProduto {


			public static void main(String[] args) throws SQLException {
			
				
				ConnectionFactory connectionFactory = new ConnectionFactory();
				Connection connection = connectionFactory.conexao();
				
				//Java 13 text blocks ( Preview )
				
				String sql = "CREATE TABLE PRODUTO (id INT AUTO_INCREMENT, nome VARCHAR(50) NOT NULL, descricao VARCHAR(255),PRIMARY KEY(id)) Engine = InnoDB";
				
				Statement stmt = connection.createStatement();
				stmt.execute(sql);
				
				System.out.println("Tabela criada com sucesso!");
				connection.close();
				

	}

}
