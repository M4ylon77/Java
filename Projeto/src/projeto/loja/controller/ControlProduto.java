package projeto.loja.controller;

import java.util.Scanner;

import projeto.loja.modulos.Headset;
import projeto.loja.modulos.Mouse;
import projeto.loja.modulos.Produto;
import projeto.loja.modulos.Teclado;
import projeto.loja.tela.TelaDeProdutos;
import projeto.loja.util.Mensagem;

public class ControlProduto {
	static Produto estoque = new Produto();
	
	public static void cadastrar() {
		Scanner leitor = new Scanner (System.in);
		int opcao;
		String nome_produto;
		double valor;
		
		System.out.println(Mensagem.CADASTRO_PRODUTO);
		System.out.println(Mensagem.MSG_ESCOLHA_PRODUTO);
		System.out.println(Mensagem.MSG_TECLADO);
		System.out.println(Mensagem.MSG_HEADSET);
		System.out.println(Mensagem.MSG_MOUSE);
		opcao = leitor.nextInt();
		leitor.nextLine();
		
		switch(opcao) {
		case 1:
		
		System.out.println(Mensagem.ADD_TECLADO);
			
		System.out.println(Mensagem.NOME_PRODUTO);
		nome_produto = leitor.nextLine();
		
		System.out.println(Mensagem.VALOR_PRODUTO);
		valor = leitor.nextDouble();
		
		Teclado teclado = new Teclado(nome_produto,valor);
		
		estoque.adicionar(teclado);
		
		System.out.println(Mensagem.PRODUTO_ADD);
		
		break;
		case 2:
			
			System.out.println(Mensagem.ADD_HEADSET);
			
			System.out.println(Mensagem.NOME_PRODUTO);
			nome_produto = leitor.nextLine();
			
			System.out.println(Mensagem.VALOR_PRODUTO);
			valor = leitor.nextDouble();
			
			Headset headset = new Headset(nome_produto,valor);
			
			estoque.adicionar(headset);
			
			System.out.println(Mensagem.PRODUTO_ADD);
			
			
			break;
		case 3:
			
			System.out.println(Mensagem.ADD_MOUSE);
			
			System.out.println(Mensagem.NOME_PRODUTO);
			nome_produto = leitor.nextLine();
			
			System.out.println(Mensagem.VALOR_PRODUTO);
			valor = leitor.nextDouble();
			
			Mouse mouse = new Mouse(nome_produto,valor);
			
			estoque.adicionar(mouse);
			
			System.out.println(Mensagem.PRODUTO_ADD);
			
			
			break;
		
		}
		
		TelaDeProdutos.mostrar();
		
	}
	
	public static void listar() {
		
		if(estoque.getTeclados().size()==0 && estoque.getHeadsets().size()==0 && estoque.getMouse().size()==0) {
			
			System.out.println(Mensagem.ADD_PRODUTO);
			
		}else{
		if(estoque.getTeclados().size()==0) {
			System.out.println();
		}else {	
		System.out.println(Mensagem.TELA_LISTA_PRODUTOS);
		System.out.println(Mensagem.LISTA_TECLADOS);
		for(Teclado teclado : estoque.getTeclados()) {
			System.out.println("\nNome: "+teclado.getNome()+
					"\nValor: "+ teclado.getValor()+"\n");
			
			System.out.flush();
		}
}
		if(estoque.getHeadsets().size()==0) {
		System.out.println();	
		}else {
			
			System.out.println(Mensagem.LISTA_HEADSETS);
			for(Headset headset : estoque.getHeadsets()) {
				System.out.println("\nNome: "+headset.getNome()+
						"\nValor: "+ headset.getValor()+"\n");
				
				System.out.flush();
			
			}
			
		}
	if(estoque.getMouse().size()==0) {
			System.out.println();
	}
	else {
			System.out.println(Mensagem.LISTA_MOUSES);
			for(Mouse mouse : estoque.getMouse()) {
				System.out.println("\nNome: "+mouse.getNome()+
						"\nValor: "+ mouse.getValor()+"\n");
				
				System.out.flush();
			
		}
	}	
}
		
	TelaDeProdutos.mostrar();
}
	
	public static void excluir() {
		
		System.out.println("cara se e chato hein!");
		
	}
	
	
}
