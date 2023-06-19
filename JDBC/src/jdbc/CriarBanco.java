package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CriarBanco {

	public static void main(String[] args) throws SQLException {

		
		  final String url =
		  "jdbc:mysql://localhost?verifyServerCertificate=false&useSSL=true"; final
		  String usuario = "root"; final String senha = "12345678";
		  
		  Connection conexao = DriverManager .getConnection(url, usuario, senha);
		 
		//Connection conexao = Conexao.getConexao();
		  
		Statement stmt = conexao.createStatement();

		// GARANTE QUE O COMANDO RODE NOVAMENTE MESMO COM BANCO CRIADO
		stmt.execute("CREATE DATABASE IF NOT EXISTS loja_virtual");
		// O COMANDO N�O VAI RODA CASO O BANCO JA EXISTA
		// stmt.execute("Create database curso_java");

		System.out.println("Banco criado com sucesso!");

		conexao.close();
	}

}
