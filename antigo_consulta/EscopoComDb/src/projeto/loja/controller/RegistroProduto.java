package projeto.loja.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import projeto.loja.listas.ListaCliente;
import projeto.loja.listas.ListaProduto;
import projeto.loja.mensagem.Mensagem;
//import projeto.loja.relatorio.Declaration;
import projeto.loja.modulos.Cliente;
import projeto.loja.modulos.Headset;
import projeto.loja.modulos.Mouse;
import projeto.loja.modulos.Pedido;
import projeto.loja.modulos.Teclado;
import projeto.loja.relatorio.Declaration;
import projeto.loja.tela.TelaMenu;

public class RegistroProduto {

	static ListaProduto produto = new ListaProduto();	

		public static void  adicionarProduto() {
			Scanner leitor = new Scanner(System.in);
			
			String nomeMouse , nomeTeclado , nomeHeadset , tipo;
			
			int opcao,escolha;
			double valor;
			
			
			do {
				System.out.println("===Tela de Produtos===");	
				System.out.println("===Qual produto deseja adicionar===\nTeclado[1]\n"
							+ "Mouse[2]\n"
							+ "Headset[3]\n"
							+ "Voltar ao menu principal[4]\n"
							+ "Encerrar programa[5]");	
							escolha = leitor.nextInt();
							leitor.nextLine();
//					Adicionando o produto na lista	
		
					switch(escolha) {
					case 1:
						do {
						System.out.println("===Um Teclado sera adicionado===\n");
						
						System.out.println("Qual a marca desse Teclado?");
						nomeTeclado = leitor.nextLine();
						
						System.out.println("Qual qual o valor?");
						valor = leitor.nextDouble();
						
						
						Teclado teclado = new Teclado(nomeTeclado,valor);
					
						
						produto.adicionar(teclado);//item 0
					
						
						System.out.println("Deseja adicionar outro Teclado?\n(Sim[1] - Não[2])");
						opcao = leitor.nextInt();
						leitor.nextLine();
						
						}while(opcao == 1);
						
						
						System.out.println("Retornar menu de Opções de produtos[1]\n"
								+ "Menu principal[2]\n"
								+ "Encerrar programa[3]");
						escolha = leitor.nextInt();
						leitor.nextLine();
										
						if(escolha == 2) {
							
							TelaMenu.Iniciar();	
							
						}else if(escolha == 3) {
							

							System.out.println(Mensagem.Msg_encerramento);
						
							
						}
					
						
					break;
						
					
					case 2:
						do {
						System.out.println("===Um mouse será adicionado===\n");
						System.out.println("Qual a marca desse mouse?");
						nomeMouse = leitor.nextLine();
					
						System.out.println("Qual qual o valor?");
						valor = leitor.nextDouble();
						
						
						Mouse mouse = new Mouse(nomeMouse,valor);
						
						produto.adicionar(mouse);//item 0


						System.out.println("Deseja adicionar outro mouse?\n(Sim[1] - Não[2])");
						opcao = leitor.nextInt();
					
					
					//colocamos esta linha pare evitar erros na repetição
					leitor.nextLine();	
					}while(opcao == 1);
					
					
					System.out.println("Retornar menu de Opções de produtos[1]\n"
							+ "Menu principal[2]\n"
							+ "Encerrar programa[3]");
					escolha = leitor.nextInt();
					leitor.nextLine();
									
					if(escolha == 2) {
						
						TelaMenu.Iniciar();	
						
					}else if(escolha == 3) {
						

						System.out.println(Mensagem.Msg_encerramento);
					
						
					}
					

					break;
					
					case 3 :
						do {
						System.out.println("===Um Headset será adicionado===\n");
						
						System.out.println("Qual a marca desse Headset?");
						nomeHeadset = leitor.nextLine();
						
						System.out.println("Qual qual o valor?");
						valor = leitor.nextDouble();
						
						Headset headset = new Headset(nomeHeadset,valor);
						
						produto.adicionar(headset);//item 0
						
					
						System.out.println("Deseja adicionar outro headset?\n(Sim[1] - Não[2])");
						opcao = leitor.nextInt();
						
						leitor.nextLine();
					}while(opcao == 1);
						
						
							System.out.println("Retornar menu de Opções de produtos[1]\n"
									+ "Menu principal[2]\n"
									+ "Encerrar programa[3]");
							escolha = leitor.nextInt();
							leitor.nextLine();
											
							if(escolha == 2) {
								
								TelaMenu.Iniciar();	
								
							}else if(escolha == 3) {
								

								System.out.println(Mensagem.Msg_encerramento);
							
								
							}
							break;
					case 4:
						
						TelaMenu.Iniciar();
						
						break;
							
					}
				
						
						
					
			}while(escolha == 1);
			
		}
		
		public static ListaProduto getProduto() {
			return produto;
		}
}	
//	do {
//	System.out.println("===Tela de Produtos===");	
//	System.out.println("===Escolha uma opção===\nRegistrar produto[1]\n"
//				+ "Listar produtos[2]\n"
//				+ "Voltar[3]");	
//				escolha = leitor.nextInt();
//				leitor.nextLine();
//				
//		if(escolha == 1) {
//		
//		System.out.println("===Adicionar Produtos==\n");			
//		System.out.println("Qual produto será adicionado na loja?");
//		tipo = leitor.nextLine();
//		
//		//Adicionando o produto na lista
//		
//		switch (tipo) {
//		case "mouse":
//		do {
//		
//			System.out.println("===Um mouse será adicionado===\n");
//			System.out.println("Qual a marca desse mouse?");
//			nomeMouse = leitor.nextLine();
//		
//			System.out.println("Qual qual o valor?");
//			valor = leitor.nextDouble();
//			
//			
//			Mouse mouse = new Mouse(nomeMouse,valor);
//			
//			produto.adicionar(mouse);//item 0
//
//
//			System.out.println("Deseja adicionar outro mouse");
//			opcao = leitor.next();
//		
//		
//		//colocamos esta linha pare evitar erros na repetição
//		leitor.nextLine();	
//		}while(opcao.equals("sim"));
//		
//		
//		System.out.println("Retornar menu de Opções de produtos[1]\n"
//				+ "Menu principal[2]\n"
//				+ "Encerrar programa[3]");
//		escolha = leitor.nextInt();
//		leitor.nextLine();
//						
//		if(escolha == 2) {
//			
//			Menu.Iniciar();	
//			
//		}
//		
//
//			
//		break;
//
//		case "teclado":
//			do {
//			System.out.println("===Um Teclado sera adicionado===\n");
//			
//			System.out.println("Qual a marca desse Teclado?");
//			nomeTeclado = leitor.nextLine();
//			
//			System.out.println("Qual qual o valor?");
//			valor = leitor.nextDouble();
//			
//			
//			Teclado teclado = new Teclado(nomeTeclado,valor);
//		
//			
//			produto.adicionar(teclado);//item 0
//		
//			
//			System.out.println("Deseja adicionar outro Teclado");
//			opcao = leitor.next();
//			
//			
//		leitor.nextLine();
//		}while(opcao.equals("sim"));
//			
//			System.out.println("Retornar menu de Opções de produtos[1]\n"
//					+ "Menu principal[2]\n"
//					+ "Encerrar programa[3]");
//			escolha = leitor.nextInt();
//			leitor.nextLine();
//							
//			if(escolha == 2) {
//				
//				Menu.Iniciar();	
//				
//			}
//		break;
//		
//		
//		case "headset":
//			do {
//			System.out.println("===Um Headset será adicionado===\n");
//			
//			System.out.println("Qual a marca desse Headset?");
//			nomeHeadset = leitor.nextLine();
//			
//			System.out.println("Qual qual o valor?");
//			valor = leitor.nextDouble();
//			
//			Headset headset = new Headset(nomeHeadset,valor);
//			
//			produto.adicionar(headset);//item 0
//			
//		
//			System.out.println("Deseja adicionar outro headset");
//			opcao = leitor.next();
//			
//			leitor.nextLine();
//		}while(opcao.equals("sim"));
//			
//			
//				System.out.println("Retornar menu de Opções de produtos[1]\n"
//						+ "Menu principal[2]\n"
//						+ "Encerrar programa[3]");
//				escolha = leitor.nextInt();
//				leitor.nextLine();
//								
//				if(escolha == 2) {
//					
//					Menu.Iniciar();	
//					
//				}
//		
//			
//			
//		break;
//		
//		
//		
//		}
//}
//		
//		else if(escolha == 2) {
//			if(produto.getTeclados().size()==0 && produto.getMouse().size()==0 && produto.getHeadsets().size()==0) {
//				
//				System.out.println("\n====Ainda nao ha produtos listados====");
//			}
//			if(produto.getTeclados().size() == 0) {
//				
//				System.out.println();
//				
//			}else {
//			System.out.println("===Lista de produtos===\n");
//			System.out.println("===Teclados===\n");
//			for(Teclado teclados : produto.getTeclados()) {
//		    System.out.println("Nome:"+teclados.getNome()+
//		    		"\nValor:" +teclados.getValor()+"\n");
//	
//		    System.out.flush();
//			}
//		}
//			if(produto.getMouse().size() == 0) {
//				
//				System.out.println();
//				
//			}else {
//		    System.out.println("\n===Mouses===");
//		    for(Mouse mouse : produto.getMouse()) {
//		    	System.out.println("Nome: " + mouse.getNome()+"\nValor: "+
//		    			mouse.getValor());
//		    	System.out.flush();
//		    	
//		    }
//	}
//			if(produto.getHeadsets().size() == 0) {
//				
//				System.out.println();
//				
//			}else {		
//			System.out.println("\n===Headsets===\n");
//			for(Headset headsets : produto.getHeadsets()) {
//		    System.out.println("Nome:"+headsets.getNome()+
//		    		"\nValor:" +headsets.getValor()+"\n");
//		    System.out.flush();
//			
//			}
//
//	}	    
//		    
//		    
//		}
//			
//			System.out.println("Retornar menu de Opções de produtos[1]\n"
//					+ "Menu principal[2]\n"
//					+ "Encerrar programa[3]");
//			escolha = leitor.nextInt();
//			leitor.nextLine();
//							
//			if(escolha == 2) {
//				
//				Menu.Iniciar();	
//				
//			}
//	
//			
//			
//		
//		
//			
//		}while(escolha == 1);
//	
//	if(escolha == 3) {
//		
//	
//
//	System.out.println("===Programa encerrado===");	
//		
//	}
//
//}
		
		
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



		
	
		

