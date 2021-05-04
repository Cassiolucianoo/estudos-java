package jdbcDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	public Connection conexao() throws SQLException {
	
		final String url = "jdbc:mysql://localhost/loja_virtual?verifyServerCertificate=false&useSSL=true";
		final String usuario = "root";
		final String senha = "12345678";
		
		return DriverManager
				.getConnection(url, usuario, senha);
	}
}
