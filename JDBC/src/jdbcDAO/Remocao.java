package jdbcDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class Remocao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperaConexao();
        int id = 1;
        
    	PreparedStatement stm = connection.prepareStatement("DELETE FROM PRODUTO WHERE (ID) > ? ");
    	stm.setInt(1, id);
		stm.execute();
        
		Integer linhasAlteradas = stm.getUpdateCount();
		System.out.println("Deletados da lista = " + linhasAlteradas);
		connection.close();

	}

}
