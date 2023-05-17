package principal;

import java.sql.*;
import java.util.Scanner;

public class Programa {
	
	public static void main(String[] args)  {
		
		Tela.telaunique();
	}
		
	
	public static void listar() {
		
		try {
		
		String url = "jdbc:mysql://localhost:3306/exemplojdbc";
		String usuario = "root";
		String senha = "positivo";
		
		Connection con = DriverManager.getConnection(url, usuario, senha);
		
		Statement comando = con.createStatement();
		ResultSet resultado = comando.executeQuery("select * from pessoas;");
		
		while(resultado.next()) {
			int id = resultado.getInt("idpessoa");
			String nome = resultado.getString("nome");
			String cpf = resultado.getString("cpf");
			double peso = resultado.getDouble("peso");
			
			System.out.println(id+"\n"+nome+"\n"+cpf+"\n"+peso+"\n"+"--------------------");
			
		
		
	}
		}catch(Exception e) {
			
			System.out.println("deu erro cara!");
		}
		Tela.telaunique();

}
	
	public static void criar() {
		
	try {	
		

		String url = "jdbc:mysql://localhost:3306/exemplojdbc";
		String usuario = "root";
		String senha = "positivo";
		
//		String sql = "INSERT INTO pessoas (`nome`,`cpf,`peso`) VALUES (?,?,?);";
		String sql = "INSERT INTO pessoas (`nome`,`cpf`,`peso`) VALUES (?,?,?);";

		Connection con = DriverManager.getConnection(url,usuario,senha);
		
		PreparedStatement comando = con.prepareStatement(sql);
	
		comando.setString (1, "Geucimar");
		comando.setString(2, "23216546541");
		comando.setDouble(3, 40.12);
	
		comando.executeUpdate();
		
		comando.close();
		con.close();
	
	}catch(Exception e) {
		System.out.println("ta errado meu brodi");
		System.out.println(e);
	}
	
		listar();
	}
	
	public static void alterar(Pessoa pessoa) {
	
		
		try {
		String url = "jdbc:mysql://localhost:3306/exemplojdbc";
		String usuario = "root";
		String senha = "positivo";
		

		String sql = "UPDATE pessoas SET `nome` = ? , `cpf` = ?,`peso` = ? WHERE `idpessoa` = ?;";
		
		Connection con = DriverManager.getConnection(url,usuario,senha);
		
		PreparedStatement comando = con.prepareStatement(sql);
	
		comando.setString(1,pessoa.getNome());
		comando.setString(2, pessoa.getCpf());
		comando.setDouble(3, pessoa.getPeso());
		
		comando.setInt(4, pessoa.getIdPessoa());
		
		comando.executeUpdate();
		
		comando.close();
		con.close();
	
	}catch(Exception e) {
		System.out.println("ta errado meu brodi");
		System.out.println(e);
	}
	listar();
		
	}
	
	public static void excluir(int id) {
		
		try {
			String url = "jdbc:mysql://localhost:3306/exemplojdbc";
			String usuario = "root";
			String senha = "positivo";
			

			String sql = "DELETE FROM pessoas WHERE `idpessoa` = ?;";
			
			Connection con = DriverManager.getConnection(url,usuario,senha);
			
			PreparedStatement comando = con.prepareStatement(sql);
		
			comando.setInt(4,id);
			
			comando.executeUpdate();
			
			comando.close();
			con.close();
		
		}catch(Exception e) {
			System.out.println("ta errado meu brodi");
			System.out.println(e);
		}
	
		listar();
		
	}
	
}