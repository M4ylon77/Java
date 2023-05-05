package projeto.loja.menu;

import java.util.Scanner;

import projeto.loja.modulos.Cadastro;
//import projeto.loja.relatorio.Declaration;

public class Menu {
	public static void Iniciar (){
		Scanner leitor = new Scanner (System.in);
		String opcao;
		
		System.out.println("===Bem vindo a loja de perifericos===\n");
		
		System.out.println("Diga oque deseja fazer!\n"
				+ "===opções==="
				+ "\nCadastrar clientes e suas compras realizadas!:[cadastro]\n"
				+ "Cadastrar novos produtos[perifericos]\n"
				+ "Listar clientes cadastrados[clietes]\n"
				+ "Listar os produtos da loja[produtos]\n"
				+ "Listar clientes e os produtos registrados até o momento![registros]\n"
				+ "Listar cliente e os produtos adiquiridos[vendas]");
		opcao= leitor.nextLine();
		
		switch(opcao) {
		case "cadastro":
			
			Cadastro.Cliente();
			
		break;
		
		case "perifericos":
			

			Cadastro.Produto();
			
			
			
			
		break;
		case "clientes":
			// galera aqui seria para mostrar somente os clientes cadastrados todos que foram inseridos no cadastro!!
		
			
		break;
		case "produtos":
			//mesma coisa aqui no caso e para os produtos
		
			
			
		break;
		
		case "registros":
		//aqui seria para os dois tanto para os clientes quanto para os produtos registrados 
			
			
		break;
		
		case "vendas":
		
		// aqui nao sei como mas fazer a relação dai certo no caso entre os produtos que foram add na "loja" e o cliente e mostra o nome e o produto que foi comprado pelo cliente!
			
		break;
		
		}
		
		
		
	}
	
	
}


// mostrar na tela quando solicitado lista de cadastro de produtos e clientes
//tbm mostrar na tela quando solicitado oque cada cliente comprou
//