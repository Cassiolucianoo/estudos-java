package jdbcDAO;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class Remocao {

	public static void main(String[] args) throws SQLException {
		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.conexao();
        int id = 1;
		Statement stm = connection.createStatement();
		stm.execute("DELETE FROM PRODUTO WHERE (ID) like ('"+id+"')");
		Integer linhasAlteradas = stm.getUpdateCount();
		System.out.println("Deletados da lista = " + linhasAlteradas);
		connection.close();

	}

}
