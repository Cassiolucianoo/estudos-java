package jdbcDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;



public class Listagem {

	public static void main(String[] args) throws SQLException{
		
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.conexao();
		
			 
	
		PreparedStatement stm = connection.prepareStatement("SELECT ID, NOME,DESCRICAO FROM PRODUTO");
		stm.execute();
		ResultSet rst = stm.getResultSet();
		
		  while (rst.next()) {
			  Integer id = rst.getInt("ID");
			  String nome = rst.getString("NOME");
			  String descricao = rst.getString("DESCRICAO");
			  
			  System.out.println("ID = "+id+", Modelo: "+nome+", Descri��o: "+descricao);
			
		}
		
			 System.out.println("Fechando Conex�o");
	 	    connection.close();

	}

}
