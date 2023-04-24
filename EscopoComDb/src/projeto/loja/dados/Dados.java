package projeto.loja.dados;

import java.io.FileNotFoundException;

import projeto.loja.modulos.Cadastro;
import projeto.loja.modulos.Cliente;
import projeto.loja.modulos.Headset;
import projeto.loja.modulos.Mouse;
import projeto.loja.modulos.Pedido;
import projeto.loja.modulos.Produto;
import projeto.loja.modulos.Teclado;
import projeto.loja.relatorio.Relatorio;

public class Dados {
	
		public static void  Executar() throws FileNotFoundException {
			
		    
			System.out.flush();    
		
		Mouse MouseRazer = new Mouse("Mouse Razer",640.80);
		Mouse MouseHyperx = new Mouse("Mouse Hyperx",150.87);
		Mouse MouseDragon = new Mouse("Mouse Red Dragon",150.87);
		Mouse MouseLogTech = new Mouse("Mouse LogTech",150.87);
		System.out.flush();
		Teclado TecladoRazer = new Teclado("Teclado Razer",345.78);
		Teclado TecladoHyperx = new Teclado("Teclado Hyperx",339.99);
		Teclado TecladoDragon = new Teclado("Teclado Red Dragon",339.99);
		Teclado TecladoLogTech = new Teclado("Teclado LogTech",339.99);
		
		System.out.flush();
		Headset HeadsetRazer = new Headset("Headset Cobra",178.68);
		Headset HeadsetDragon = new Headset("Headset Red Dragon",500.56);
		Headset HeadsetHyperx = new Headset("Headset Hyperx",563.56);
		Headset HeadsetLogTech = new Headset("Headset LogTech ",430.00);
		
		//Adicionando o produto na lista
		Produto produto = new Produto();
		
		System.out.flush();
		//Mouses
		produto.adicionar(MouseRazer);//item 0
		produto.adicionar(MouseHyperx);
		produto.adicionar(MouseDragon);
		produto.adicionar(MouseLogTech);
		System.out.flush();
		//Teclados
		produto.adicionar(TecladoRazer);//item 0
		produto.adicionar(TecladoHyperx);
		produto.adicionar(TecladoDragon);
		produto.adicionar(TecladoLogTech);
		System.out.flush();
//		Headsets
		produto.adicionar(HeadsetRazer);//item 0
		produto.adicionar(HeadsetDragon);
		produto.adicionar(HeadsetHyperx);
		produto.adicionar(HeadsetLogTech);
		System.out.flush();
		
		
		//Adicionando clientes no cadastro!
		Cliente primeiroCliente = new Cliente("Juninho Luthor", "154.664.879-55","(23)9684-684",
				"caldososonolento77@gmail.com", new Pedido(1,produto));
		
		Cliente segundoCliente = new Cliente("Eduardo Meigo", "456.684.865-55","(41)99875-234",
				"edubonitinhorei31@gmail.com", new Pedido(48,produto));
		
		Cliente terceiroCliente = new Cliente("Savio Santos", "486.679.232-55","(41)9684-444",
				"saviosantosdasilvacunhapedroso8@gmail.com", new Pedido(932,produto));
		
		Cliente quartoCliente = new Cliente("Rafael Bravo", "102.897.123-46","(41)3334-5556",
				"rafinhacamaroteselvagem9@gmail.com", new Pedido(13,produto));
		
		
		Cadastro registro = new Cadastro();
		
		registro.adicionar(primeiroCliente);//item 0
		registro.adicionar(segundoCliente);
		registro.adicionar(terceiroCliente);
		registro.adicionar(quartoCliente);
		
		
		
		
		
		
		//Inicialização do objeto
		Relatorio cliente1 = new Relatorio(registro, produto,primeiroCliente);
		Relatorio cliente2 = new Relatorio(registro, produto,segundoCliente);
		Relatorio cliente3 = new Relatorio(registro, produto,terceiroCliente);
		Relatorio cliente4 = new Relatorio(registro, produto,quartoCliente);
		
		
		

		System.out.println("Loja de Perifericos");
		
		
		Dados dados = new Dados();

		//Teste
		System.out.println("==Clientes cadastrados!===\n");
		
		for(Cliente clientes : registro.getCliente()) {
	        System.out.println("Nome:"+clientes.getNome()
	        +"\nCpf:" +clientes.getCpf()+
	        "\nEmail:" + clientes.getEmail()+
	        "\nTelefone:" + clientes.getTelefone()+
	        "\n");
	        System.out.flush();
	   
	    }

		System.out.println("===Lista de produtos===\n");
		System.out.println("===Teclados===\n");
		for(Teclado teclados : produto.getTeclados()) {
	    System.out.println("Nome:"+teclados.getNome()+
	    		"\nValor:" +teclados.getValor()+"\n");

	    System.out.flush();
	}

		System.out.println("===Mouses===\n");	
		for(Mouse mouses : produto.getMouse()) {
	    System.out.println("Nome:"+mouses.getNome()+
	    		"\nValor:" +mouses.getValor()+"\n");
	    System.out.flush();
	}

		System.out.println("===Headsets===\n");
		for(Headset headsets : produto.getHeadsets()) {
	    System.out.println("Nome:"+headsets.getNome()+
	    		"\nValor:" +headsets.getValor()+"\n");
	    System.out.flush();
	}



		
		
		
	}
}
