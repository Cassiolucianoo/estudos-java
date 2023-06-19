package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class CriarPessoa {

	public static void main(String[] args) throws SQLException {
		
		//A Scannerclasse � usada para obter a entrada do usu�rio e � encontrada no java.utilpacote.
		Scanner entrada = new Scanner(System.in);
		
        //conex�o com o banco de dados 		
		Connection conexao = Conexao.getConexao();
		
		System.out.println("Infrome O nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Infrome O sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Infrome A Idade: ");
		int idade = entrada.nextInt();
		
		String sql = "INSERT INTO pessoas (nome, sobre_nome, idade) VALUES (?, ?, ?)";
		PreparedStatement stmt = conexao.prepareStatement(sql);
		
		//set parametros da tabela
		stmt.setString(1,  nome);
		stmt.setString(2,  sobrenome);
		stmt.setInt(3,  idade);
		
		stmt.execute();
		System.out.println("Pessoa incluida com sucesso !");
		
		//Fechando entrada scanner
       entrada.close();
	}

}
