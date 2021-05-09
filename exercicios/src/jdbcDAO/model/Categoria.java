package jdbcDAO.model;

public class Categoria {
	
	public Categoria() {
		super();
	}
	public Categoria(int id, String categoria) {
	
		this.id = id;
		this.categoria = categoria;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	private int id;
    private String categoria;
    
	@Override
	public String toString() {

		return String.format(" Lista de Categorias:  %d, %s", this.id, this.categoria);
	}
    

}
