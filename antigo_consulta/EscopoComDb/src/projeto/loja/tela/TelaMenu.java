package projeto.loja.tela;

import java.util.List;
import java.util.Scanner;
import projeto.loja.relatorio.*;
import projeto.loja.mensagem.Mensagem;
import projeto.loja.modulos.Teclado;
import projeto.loja.controller.CadastroCliente;
import projeto.loja.controller.RegistroProduto;
import projeto.loja.listas.*;


public class TelaMenu {
	public static void Iniciar (){
		Scanner leitor = new Scanner (System.in);
		int opcao;
		
		System.out.println("===Bem vindo a loja de perifericos===\n");
		
		System.out.println("Diga oque deseja fazer!\n"
				+ "===opções==="
				+ "\n===Adicionar Clientes===[1]\n"
				+ "===Adicionar Produtos===[2]\n"
				+ "===Listar Produtos Registrados===[3]\n"
				+ "===Listar clientes Registrados===[4]\n"
				+ "===Encerrar programa===[5]");
		
		
		opcao= leitor.nextInt();
		
		switch(opcao) {
		case 1:
			
			CadastroCliente.Cliente();
		
		break;
		
		case 2:
		
			RegistroProduto.adicionarProduto();
			
		break;
		case 3:

			TelaProduto.Produto();
			//Declaration.telapro(null);
			
			break;
	
		case 4:
			
			TelaCliente.Cliente();
			
			break;

			
		
			case 5:
			System.out.println(Mensagem.Msg_encerramento);
			break;
	
			
		}
		
	}
	
	
}


// mostrar na tela quando solicitado lista de cadastro de produtos e clientes
//tbm mostrar na tela quando solicitado oque cada cliente comprou
//