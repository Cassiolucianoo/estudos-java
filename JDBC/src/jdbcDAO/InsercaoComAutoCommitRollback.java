package jdbcDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsercaoComAutoCommitRollback {

	public static void main(String[] args) throws SQLException {

		ConnectionFactory connectionFactory = new ConnectionFactory();
		Connection connection = connectionFactory.recuperaConexao();

		connection.setAutoCommit(false);

		try {
			PreparedStatement stm = connection.prepareStatement("INSERT INTO PRODUTO (nome, descricao) VALUES (? , ? )",
					Statement.RETURN_GENERATED_KEYS);
			
			addProdutos("SmartTv", "45Polegadas", stm);
			addProdutos("cel", "pirata", stm);
			
			connection.commit();
			stm.close();
			connection.close();
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("ROLLBACL EXECUTADO");
			connection.rollback();
		}

	}

	private static void addProdutos(String nome, String descricao, PreparedStatement stm) throws SQLException {
		stm.setString(1, nome);
		stm.setString(2, descricao);
		
		if(nome.equals("cel")) {
			throw new RuntimeException("Nada feito");
		}

		stm.execute();
		ResultSet rst = stm.getGeneratedKeys();

		while (rst.next()) {
			Integer id = rst.getInt(1);
			System.out.println("ID = " + id + " Nome :" + nome + "Descrição " + descricao);

		}
	}

}
