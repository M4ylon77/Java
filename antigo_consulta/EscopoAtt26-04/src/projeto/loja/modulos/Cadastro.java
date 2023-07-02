package projeto.loja.modulos;

import java.util.Scanner;
import projeto.loja.dados.Produto;
import projeto.loja.dados.Registro;
import projeto.loja.menu.Menu;
//import projeto.loja.relatorio.Declaration;

public class Cadastro {
		
	
		public static void  Produto() {
			Scanner leitor = new Scanner(System.in);
			
			String nomeMouse , nomeTeclado , nomeHeadset , tipo, opcao;
			double valor;
			
		
		System.out.println("===Adicionar Produtos==\n");			
		System.out.println("Qual produto será adicionado na loja?");
		tipo = leitor.nextLine();
		
		//Adicionando o produto na lista
		Produto produto = new Produto();
		
		switch (tipo) {
		case "mouse":
		do {
		
			System.out.println("===Um mouse será adicionado===\n");
			System.out.println("Qual a marca desse mouse?");
			nomeMouse = leitor.nextLine();
		
			System.out.println("Qual qual o valor?");
			valor = leitor.nextDouble();
			
			Mouse mouse = new Mouse(nomeMouse,valor);
			
			produto.adicionar(mouse);//item 0


			System.out.println("Deseja adicionar outro mouse");
			opcao = leitor.next();

		
		leitor.nextLine();//colocamos esta linha pare evitar erros na repetição
		}while(opcao.equals("sim"));
		
		
				
		System.out.println("Voltar para o menu?");
		opcao = leitor.next();
		
		if(opcao.equals("sim")) {
			
			Menu.Iniciar();	
			
		}
		

			
		break;
		
		
		case "teclado":
			do {
			System.out.println("===Um Teclado sera adicionado===\n");
			
			System.out.println("Qual a marca desse Teclado?");
			nomeTeclado = leitor.nextLine();
			
			System.out.println("Qual qual o valor?");
			valor = leitor.nextDouble();
			
			Teclado teclado = new Teclado(nomeTeclado,valor);
		
			
			produto.adicionar(teclado);//item 0
		
			
			System.out.println("Deseja adicionar outro Teclado");
			opcao = leitor.next();
			
		
		leitor.nextLine();
		}while(opcao.equals("sim"));
			System.out.println("Voltar para o menu?");
			opcao = leitor.next();
			
			if(opcao.equals("sim")) {
				
				Menu.Iniciar();	
			
			}
			
		
		break;
		
		
		case "headset":
			do {
			System.out.println("===Um Headset será adicionado===\n");
			
			System.out.println("Qual a marca desse Headset?");
			nomeHeadset = leitor.nextLine();
			
			System.out.println("Qual qual o valor?");
			valor = leitor.nextDouble();
			
			Headset headset = new Headset(nomeHeadset,valor);
			
			produto.adicionar(headset);//item 0
			
		
			System.out.println("Deseja adicionar outro headset");
			opcao = leitor.next();
			
			switch(opcao) {
			case "nao":
			
			System.out.println("Voltar para o menu?");
			opcao = leitor.nextLine();
			
			if(opcao.equals("sim")) {
				
				Menu.Iniciar();	
				
			}
				
			break;
			}
		leitor.nextLine();
		}while(opcao.equals("sim"));
			System.out.println("Voltar para o menu?");
			opcao = leitor.next();
			
			if(opcao.equals("sim")) {
				
				Menu.Iniciar();	
				
			}
		break;
		
		
		
		}
		
		leitor.nextLine();

		
}

		
		
		//Aqui jaz a função para cadastro do cliente
		public static void Cliente() {
			Scanner leitor = new Scanner(System.in);
		String nomeCliente, cpf, email, telefone, opcao,opcaoMenu;
		int id , lista=0;	
			
		Registro registro = new Registro();	
		do {	
			System.out.println("===Adicionar Cliente===\n");
			System.out.println("Infome\nNome: ");
			nomeCliente = leitor.nextLine();
			System.out.println("Cpf: ");
			cpf = leitor.nextLine();
			System.out.println("Telefone com DD: ");
			telefone = leitor.nextLine();
			System.out.println("Email: ");
			email = leitor.nextLine();
			System.out.println("Id do pedido: ");
			id = leitor.nextInt();
			
			
			
			registro.adicionar(new Cliente(nomeCliente,cpf,telefone,email, new Pedido(id,new Produto())));	
			
	
			
			System.out.println("Cliente " +registro.getCliente().get(lista).getNome()+ " cadastrado!");
			lista++;
		
			System.out.println("Deseja adicionar outro cliente na lista?");
			opcao = leitor.next();
		
		
		
			leitor.nextLine();
			}while(opcao.equals("sim"));
			System.out.println("Voltar para o menu?");
			opcaoMenu = leitor.nextLine();
		
			if(opcaoMenu.equals("sim")) {
			
			Menu.Iniciar();	
			
		}
		}
		
		
//		
//		Mouse MouseRazer = new Mouse(nome,valor);
//		Mouse MouseHyperx = new Mouse(nome2, vall);
//		Mouse MouseDragon = new Mouse("Mouse Red Dragon",150.87);
//		Mouse MouseLogTech = new Mouse("Mouse LogTech",150.87);
//
//		
//		Teclado TecladoRazer = new Teclado("Teclado Razer",345.78);
//		Teclado TecladoHyperx = new Teclado("Teclado Hyperx",339.99);
//		Teclado TecladoDragon = new Teclado("Teclado Red Dragon",339.99);
//		Teclado TecladoLogTech = new Teclado("Teclado LogTech",339.99);
//		
//
//		Headset HeadsetRazer = new Headset("Headset Cobra",178.68);
//		Headset HeadsetDragon = new Headset("Headset Red Dragon",500.56);
//		Headset HeadsetHyperx = new Headset("Headset Hyperx",563.56);
//		Headset HeadsetLogTech = new Headset("Headset LogTech ",430.00);
		
		
//		System.out.println("obrigado!");
		
		//Mouses
		
//		
//		produto.adicionar(MouseHyperx);
//		produto.adicionar(MouseDragon);
//		produto.adicionar(MouseLogTech);
//		System.out.flush();
//		//Teclados
//		produto.adicionar(TecladoRazer);//item 0
//		produto.adicionar(TecladoHyperx);
//		produto.adicionar(TecladoDragon);
//		produto.adicionar(TecladoLogTech);
//		System.out.flush();
////		Headsets
//		produto.adicionar(HeadsetRazer);//item 0
//		produto.adicionar(HeadsetDragon);
//		produto.adicionar(HeadsetHyperx);
//		produto.adicionar(HeadsetLogTech);
//		System.out.flush();
		
		
		//Adicionando clientes no cadastro!
//		Cliente primeiroCliente = new Cliente("Juninho Luthor", "154.664.879-55","(23)9684-684",
//				"caldososonolento77@gmail.com", new Pedido(1,produto));
//		
//		Cliente segundoCliente = new Cliente("Eduardo Meigo", "456.684.865-55","(41)99875-234",
//				"edubonitinhorei31@gmail.com", new Pedido(48,produto));
//		
//		Cliente terceiroCliente = new Cliente("Savio Santos", "486.679.232-55","(41)9684-444",
//				"saviosantosdasilvacunhapedroso8@gmail.com", new Pedido(932,produto));
//		
//		Cliente quartoCliente = new Cliente("Rafael Bravo", "102.897.123-46","(41)3334-5556",
//				"rafinhacamaroteselvagem9@gmail.com", new Pedido(13,produto));
//		
//		
//		Cadastro registro = new Cadastro();
//		
//		registro.adicionar(primeiroCliente);//item 0
//		registro.adicionar(segundoCliente);
//		registro.adicionar(terceiroCliente);
//		registro.adicionar(quartoCliente);
//		
//		
//		
//		
//		
//		
//		//Inicialização do objeto
//		
//		Relatorio cliente2 = new Relatorio(registro, produto,segundoCliente);
//		Relatorio cliente3 = new Relatorio(registro, produto,terceiroCliente);
//		Relatorio cliente4 = new Relatorio(registro, produto,quartoCliente);
//		
//		
//		
//
//		System.out.println("Loja de Perifericos");
//		
//		
//		Dados dados = new Dados();
//
//		//Teste
//		System.out.println("==Clientes cadastrados!===\n");
//		
//		for(Cliente clientes : registro.getCliente()) {
//	        System.out.println("Nome:"+clientes.getNome()
//	        +"\nCpf:" +clientes.getCpf()+
//	        "\nEmail:" + clientes.getEmail()+
//	        "\nTelefone:" + clientes.getTelefone()+
//	        "\n");
//	        System.out.flush();
//	   
//	    }
//
//		System.out.println("===Lista de produtos===\n");
//		System.out.println("===Teclados===\n");
//		for(Teclado teclados : produto.getTeclados()) {
//	    System.out.println("Nome:"+teclados.getNome()+
//	    		"\nValor:" +teclados.getValor()+"\n");
//
//	    System.out.flush();
//	}
//
//		System.out.println("===Mouses===\n");	
//		for(Mouse mouses : produto.getMouse()) {
//	    System.out.println("Nome:"+mouses.getNome()+
//	    		"\nValor:" +mouses.getValor()+"\n");
//	    System.out.flush();
//	}
//
//		System.out.println("===Headsets===\n");
//		for(Headset headsets : produto.getHeadsets()) {
//	    System.out.println("Nome:"+headsets.getNome()+
//	    		"\nValor:" +headsets.getValor()+"\n");
//	    System.out.flush();
//	}



		
	
		
}
