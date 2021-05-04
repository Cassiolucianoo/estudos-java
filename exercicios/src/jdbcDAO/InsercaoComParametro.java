package jdbcDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsercaoComParametro {

	public static void main(String[] args) throws SQLException {

		String nome = "Mose ";
		String descricao = "Mose zerado na caixa ";

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.conexao();

		PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (? , ? )",Statement.RETURN_GENERATED_KEYS);
		stm.setString(1, nome);
		stm.setString(2, descricao);
		
		stm.execute();
		ResultSet rst = stm.getGeneratedKeys();

		while (rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("ID = " + id +" Nome :"+nome+ "Descrição "+descricao);

		}

		System.out.println("Fechando Conexão");
		connection.close();

	}

}
