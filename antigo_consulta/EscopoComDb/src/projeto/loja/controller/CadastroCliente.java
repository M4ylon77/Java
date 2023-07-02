package projeto.loja.controller;

import java.util.Scanner;

import projeto.loja.listas.ListaCliente;
import projeto.loja.listas.ListaProduto;
import projeto.loja.mensagem.Mensagem;
import projeto.loja.modulos.Cliente;
import projeto.loja.modulos.Pedido;
import projeto.loja.tela.TelaCliente;
import projeto.loja.tela.TelaMenu;

public class CadastroCliente {
	static ListaCliente registro = new ListaCliente();
	//Aqui jaz a função para cadastro do cliente
	public static void Cliente(){

		System.out.println("=====Tela Clientes=====\n");
		
		Scanner leitor = new Scanner(System.in);
	String nomeCliente, cpf, email, telefone, opcao,opcaoMenu;
	int id , lista=0,escolha;	
	
do {
		System.out.println("Cadastrar clientes[1]\n"
				+ "Listar clietes[2]\n"
				+ "Voltar ao Menu[3]");
		escolha = leitor.nextInt();
		leitor.nextLine();
	
	
	
	if(escolha == 1 ) {
	do {	
		System.out.println("=====Adicionar Cliente=====\n");
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
		
		
		
		registro.adicionar(new Cliente(nomeCliente,cpf,telefone,email, new Pedido(id,new ListaProduto())));	
		

		
		System.out.println("Cliente " +registro.getCliente().get(lista).getNome()+ " cadastrado!");
		lista++;
	
		System.out.println("Deseja adicionar outro cliente na lista[1]");
		opcao = leitor.next();
	
	
	
		leitor.nextLine();
		}while(opcao.equals("1"));
		
}
	
	
	else if(escolha == 2) {
		
		TelaCliente.Cliente();
		break;
		
	}if(escolha == 3) {
		
		TelaMenu.Iniciar();	
	
	}
		
	System.out.println("Voltar para o menu defgbdfgdf clientes[1]\n"
			+ "Voltar ao menu principal[2]\n"
			+ "Ecerrar programa[3]");
	opcaoMenu = leitor.nextLine();
	
	switch (opcaoMenu) {
	
	case "1":
		
		
		
	break;
	case "2":
	TelaMenu.Iniciar();
	break;
	case "3":
		System.out.println(Mensagem.Msg_encerramento);
		break;
	}
	}while(opcaoMenu.equals("1"));

}


public static ListaCliente getCliente() {
	return registro;	
	
}
}