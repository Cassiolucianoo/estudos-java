package jdbcDAO.testeProduto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jdbcDAO.ConnectionFactory;
import jdbcDAO.dao.CategoriaDAO;
import jdbcDAO.model.Categoria;

public class TestaListarCategoria {

	public static void main(String[] args) throws SQLException {
		try (Connection connection = new ConnectionFactory().recuperaConexao()) {
			CategoriaDAO categoriaDao = new CategoriaDAO(connection);
	
			List<Categoria> listaDeCategorias = categoriaDao.listar();
			listaDeCategorias.stream().forEach(lp -> System.out.println(lp));
		}

	}

}
