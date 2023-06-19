package jdbcDAO;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Insercao {
 
	public static void main(String[] args) throws SQLException{

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperaConexao();

		Statement stm = connection.createStatement();
		
		
		//ADD CATEGORIAS NA TABELA
		stm.execute("INSERT INTO CATEGORIA (nome) VALUES('ELETRONICO')",Statement.RETURN_GENERATED_KEYS);
		stm.execute("INSERT INTO CATEGORIA (nome) VALUES('ELETRODOMESTICOS')",Statement.RETURN_GENERATED_KEYS);
		stm.execute("INSERT INTO CATEGORIA (nome) VALUES('MOVEIS')",Statement.RETURN_GENERATED_KEYS);
		
		stm.execute("INSERT INTO PRODUTO (nome, descricao) VALUES('Teclado','Teclado com fio')",Statement.RETURN_GENERATED_KEYS);

		ResultSet rst = stm.getGeneratedKeys();

		while (rst.next()) {
			Integer id = rst.getInt(1);
		

			System.out.println("ID = " + id );

		}

		System.out.println("Fechando Conex�o");
		connection.close();

	}

}
