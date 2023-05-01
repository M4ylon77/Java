package projeto.loja.tela;

import java.util.Scanner;

import projeto.loja.controller.RegistroProduto;
import projeto.loja.listas.ListaProduto;
import projeto.loja.mensagem.Mensagem;
import projeto.loja.modulos.Headset;
import projeto.loja.modulos.Mouse;
import projeto.loja.modulos.Teclado;

public class TelaProduto {
public static void Produto() {
		
		Scanner leitor = new Scanner(System.in);
		int escolha;
		
		
		ListaProduto produto = RegistroProduto.getProduto();
		
			if(produto.getTeclados().size() == 0 && produto.getMouse().size() == 0 && produto.getHeadsets().size() == 0) {
			
			System.out.println("===Ainda não ha produtos Registrados===");

			
		}
	
		else {
			if(produto.getTeclados().size() ==0) {
				System.out.println();
			}
			else {
		System.out.println("===Lista de produtos===\n");
		System.out.println("===Teclados===\n");
		for(Teclado teclados : produto.getTeclados()) {
			System.out.println("Nome:"+teclados.getNome()+
					"\nValor:" +teclados.getValor()+"\n");
			System.out.flush();
		}
	}
		if(produto.getMouse().size() == 0) {
			System.out.println();
		}else {
			System.out.println("===Mouses===\n");	
			for(Mouse mouses : produto.getMouse()) {
		    System.out.println("Nome:"+mouses.getNome()+
		    		"\nValor:" +mouses.getValor()+"\n");
		    System.out.flush();
		}
	}
		if(produto.getHeadsets().size() == 0 ) {
			System.out.println();
		}else {
				System.out.println("===Headsets===\n");
				for(Headset headsets : produto.getHeadsets()) {
			    System.out.println("Nome:"+headsets.getNome()+
			    		"\nValor:" +headsets.getValor()+"\n");
			    System.out.flush();
			    
				} 
			}	    
		}
		
		System.out.println("\nMenu principal[1]\n"
				+ "Cadastrar produtos[2]\n"
				+ "Encerrar programa[3]");
		escolha = leitor.nextInt();
		leitor.nextLine();
						
		if(escolha == 1) {
			
			TelaMenu.Iniciar();	
			
		}else if(escolha == 2){
		
		RegistroProduto.adicionarProduto();
		
		}else {
			
			System.out.println(Mensagem.Msg_encerramento);
			
		}
	}
	
}
