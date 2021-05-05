package jdbcDAO;

import java.sql.SQLException;

public class TestandoPoolConexoes {

	public static void main(String[] args) throws SQLException {
	
		ConnectionFactory coonectionFactory = new ConnectionFactory();
		
		for (int i = 0; i < 20; i++) {
			
			coonectionFactory.recuperaConexao();
			System.out.println("Conexão de número: "+i);
		}

	}

}
