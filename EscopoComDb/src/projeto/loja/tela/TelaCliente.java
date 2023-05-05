


package projeto.loja.tela;
import java.util.Scanner;

import projeto.loja.controller.CadastroCliente;
import projeto.loja.controller.RegistroProduto;
import projeto.loja.listas.ListaCliente;
import projeto.loja.listas.ListaProduto;
import projeto.loja.mensagem.Mensagem;
import projeto.loja.modulos.Cliente;
import projeto.loja.modulos.Headset;
import projeto.loja.modulos.Mouse;
import projeto.loja.modulos.Teclado;

public class TelaCliente {
	
	
	
	public static void Cliente() {
		
		Scanner leitor = new Scanner(System.in);
		int escolha;
		
		
		
		ListaCliente registro = CadastroCliente.getCliente();
		
		
		if (registro.getCliente().size() == 0) {
			
			System.out.println("=====Ainda não ha clientes cadastrados=====\n");
			
		}else {
		
			System.out.println("=====Lista de clientes=====");
			
		for(Cliente clientes : registro.getCliente()) {
	        System.out.println("\nNome:"+clientes.getNome()
	        +"\nCpf:" +clientes.getCpf()+
	        "\nEmail:" + clientes.getEmail()+
	        "\nTelefone:" + clientes.getTelefone()+
	        "\n");
	        System.out.flush();
	   
	    	}
		}
		System.out.println("Voltar ao menu principal[1]\n"
				+ "Cadastrar clientes[2]\n"
				+ "Encerrar programa[3]");
		escolha = leitor.nextInt();
		leitor.nextLine();
		
		
		if(escolha == 1 ) {
			
			TelaMenu.Iniciar();
			
		}else if(escolha == 2 ) {
			
			CadastroCliente.Cliente();
			
		}else {
			
			System.out.println(Mensagem.Msg_encerramento);
			
		}
		
	}
}



//import java.io.FileNotFoundException;
//
//import projeto.loja.menu.Menu;
//import projeto.loja.modulos.*;
//import projeto.loja.relatorio.*;
//
//public class Tela {
//public static void main(String[] args) throws FileNotFoundException {
//	
//	Menu.Iniciar();
//	

//	for (Cliente clientes : registro.getCliente()) {
//		
//		for(int i=0; i<hash;i++)
//		System.out.println("\nNome: " + registro.getCliente().get(i).getNome()+
//				"\nCpf: " + registro.getCliente().get(i).getCpf()+
//				"\n");
//		
//	}
//	
//	
//	System.out.println("\nnome: "+ primeiroCliente.getNome()+
//	"\nid: " + primeiroCliente.getFazPedido().getId()+
//	"\nNome do produto: " + primeiroCliente.getFazPedido().getProduto().getTeclados().get(0).getNome());
//	
	
	

	
	

//		
//		}
//	
//}




//System.out.println("\n===Lista de Teclado===\n");
//
//for(Teclado teclado : produto.getTeclados()) {
//	System.out.println("Nome: "+TecladoHyperx.getNome());
//	System.out.println("Valor: "+TecladoHyperx.getValor());
//}
//
//System.out.println("\n===Lista de mouses===\n");
//for(Mouse mouses : produto.getMouse()){
//
//	System.out.println("Nome: "+MouseHyperx.getNome());
//	System.out.println("Valor: "+MouseHyperx.getValor());
//	
//}
//
//System.out.println("\n===Lista de Headsets===\n");
//
//for(Headset headsets : produto.getHeadsets()){
//	
//	System.out.println("Nome: "+HeadsetRazer.getNome());
//	System.out.println("Valor: "+HeadsetRazer.getValor());
//	
//}
//



//
//Cliente clientes = new Cliente("Junin","0213984192",
//		"(79)9999-9999","eduzinhoamassa@gmail.com",new Pedido (1,produto));
//Cliente clientes = new Cliente("Junin","0213984192",
//		"(79)9999-9999","eduzinhoamassa@gmail.com",new Pedido (1,produto));
//Cliente clientes = new Cliente("Junin","0213984192",
//		"(79)9999-9999","eduzinhoamassa@gmail.com",new Pedido (1,produto));
//Cliente clientes = new Cliente("Junin","0213984192",
//		"(79)9999-9999","eduzinhoamassa@gmail.com",new Pedido (1,produto));



