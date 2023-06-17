package jdbcDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;



public class CriarTabelaProduto {

 
			public static void main(String[] args) throws SQLException {
			
				
				ConnectionFactory connectionFactory = new ConnectionFactory();
				Connection connection = connectionFactory.recuperaConexao();
				
				//Java 13 text blocks ( Preview )
				//String sql = "Create table categoria (id int auto_increment, nome varchar (50) not null, Primary key(id)) Engine = Innodb";
				
				// ALERAR TABELA
				//String sql = "alter table produto add column CATEGORIA_ID INT";
				
				//CHAVE ESTRANGEIRA REFERENCIANDO CATEGORIA_ID PRODUTO para TABELA CATEGORIA
				//String sql = "ALTER TABLE PRODUTO ADD FOREIGN KEY (CATEGORIA_ID) REFERENCES CATEGORIA (ID)";
				
				//Update de categoria_id para tabela categoria_id produto 
				//String sql = "UPDATE PRODUTO  SET CATEGORIA_ID = 2 WHERE ID = 93";
				
				
				
			    String sql = "CREATE TABLE PRODUTO (id INT AUTO_INCREMENT, nome VARCHAR(50) NOT NULL, descricao VARCHAR(255),PRIMARY KEY(id)) Engine = InnoDB";
				
				Statement stmt = connection.createStatement();
				stmt.execute(sql);
				
				System.out.println("Tabela criada com sucesso!");
				connection.close();
				

	}

}
