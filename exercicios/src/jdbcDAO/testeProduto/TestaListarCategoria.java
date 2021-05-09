package jdbcDAO.testeProduto;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import jdbcDAO.ConnectionFactory;
import jdbcDAO.dao.CategoriaDAO;
import jdbcDAO.dao.ProdutoDAO;
import jdbcDAO.model.Categoria;
import jdbcDAO.model.Produto;

public class TestaListarCategoria {

	public static void main(String[] args) throws SQLException {
		try (Connection connection = new ConnectionFactory().recuperaConexao()) {
			CategoriaDAO categoriaDao = new CategoriaDAO(connection);
	
			List<Categoria> listaDeCategorias = categoriaDao.listar();
			listaDeCategorias.stream().forEach(ct ->  {
				System.out.println("------"+ct.getNome()+"------\n");
				
				try {
					for(Produto produto : new ProdutoDAO(connection).buscar(ct)) {
						
						System.out.println(ct.getNome() +  " - " +produto.getNome());
					}
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
			});
		}

	}

}
