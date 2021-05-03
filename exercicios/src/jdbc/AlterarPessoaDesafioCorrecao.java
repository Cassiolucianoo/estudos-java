package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class AlterarPessoaDesafioCorrecao {

	public static void main(String[] args) throws SQLException {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o código da pessoa: ");
		int codigo = entrada.nextInt();

		String select = "SELECT codigo, nome, sobre_nome, idade FROM pessoas WHERE codigo = ?";
		String update = "UPDATE pessoas SET nome = ?, sobre_nome = ?,idade = ?  WHERE codigo = ?";

		Connection conexao = Conexao.getConexao();
		PreparedStatement stmt = conexao.prepareStatement(select);
		stmt.setInt(1, codigo);
		ResultSet r = stmt.executeQuery();

		if (r.next()) {
			Pessoa p = new Pessoa(r.getInt(1), r.getString(2), r.getString(3), r.getInt(4));

			System.out.println("O nome atual é " + p.getNome() + " " + p.getSobrenome() + " Idade:" + p.getIdade());

			entrada.nextLine();

			System.out.print("Informe o novo nome: ");
			String novoNome = entrada.nextLine();

			System.out.print("Informe Sobre nome: ");
			String novoSobreNome = entrada.nextLine();

			System.out.print("Informe a idade atualizada: ");
			int idade = entrada.nextInt();

			stmt.close();
			stmt = conexao.prepareStatement(update);
			stmt.setString(1, novoNome);
			stmt.setString(2, novoSobreNome);
			stmt.setInt(3, idade);
			stmt.setInt(4, codigo);
			stmt.execute();
			
			System.out.println("Dados alterados");

			
		}else{
			System.out.println("Id não encontrado");
		}
		
		conexao.close();
		entrada.close();

	}

}
