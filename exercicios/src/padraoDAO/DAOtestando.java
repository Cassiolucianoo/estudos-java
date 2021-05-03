package padraoDAO;

public class DAOtestando {

	public static void main(String[] args) {
		
		DAO dao = new DAO();
		
		String sql = "INSERT INTO pessoas (nome, sobre_nome, idade) VALUES (?, ?, ?)";
		
		System.out.println(dao.incluir(sql, "jose","Maria",45));
		System.out.println(dao.incluir(sql, "Alex","pereira",25));
		System.out.println(dao.incluir(sql, "Andre","Pereira",48));
		System.out.println(dao.incluir(sql, "Leandro","Bezerra",35));
		System.out.println(dao.incluir(sql, "Wilian","silva",12));
		
		dao.close();

	}

}
