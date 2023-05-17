package principal;

import java.sql.*;
import java.util.Scanner;

public class programa {
	
	public static void main(String[] args)  {
			Scanner leitor = new Scanner(System.in);
		System.out.println("=====escolha=====\n"
				+ "[1]-listar\n"
				+ "[2]-adicionar");
		int escolha = leitor.nextInt();
		
		switch(escolha) {

		case 1:
			
			listar();
			
		break;
		
		case 2: 
			
			criar();
			
			break;
		}
		leitor.close();
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
	
}