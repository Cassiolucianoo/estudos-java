package jdbcDAO.testeProduto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jdbcDAO.ConnectionFactory;
import jdbcDAO.dao.CategoriaDAO;
import jdbcDAO.model.Categoria;
import jdbcDAO.model.Produto;

public class TestaListarCategoria {

	public static void main(String[] args) throws SQLException {
		try (Connection connection = new ConnectionFactory().recuperaConexao()) {
			CategoriaDAO categoriaDao = new CategoriaDAO(connection);

			List<Categoria> listaDeCategorias = categoriaDao.listarComProdutos();
			listaDeCategorias.stream().forEach(ct -> {
				System.out.println("\n------" + ct.getNome() + "------\n");

				for (Produto produto : ct.getProdutos()) {

					System.out.println(ct.getNome() + " - " + produto.getNome());
				}

			});
		}

	}

}
