package projeto.loja.tela;

import java.util.Scanner;

import projeto.loja.controller.ControlCliente;
import projeto.loja.controller.ControlPedido;
import projeto.loja.controller.ControlProduto;
import projeto.loja.util.Mensagem;

public class TelaDePedidos {
	
	public static void mostrar() {
		
	Scanner leitor = new Scanner(System.in);

//	tem que arrumar aqui tbm meu parça !!
	
	System.out.println(Mensagem.TELA_PEDIDOS);
	System.out.println(Mensagem.MSG_ESCOLHA);
	System.out.println("[1] "+Mensagem.MSG_SELECIONAR_CLIENTE);
	System.out.println("[2] "+Mensagem.MSG_SELECIONAR_PRODUTO);
	System.out.println("[3] "+Mensagem.MSG_FINALIZAR_PEDIDO);
	System.out.println("[4] "+Mensagem.MSG_VOLTAR);
	int escolha = leitor.nextInt();
	leitor.nextLine();

	switch(escolha) {
	case 1:
		ControlPedido.selecionar(); // esse funciona 
		break;
	case 2:
//		ControlProduto.selecionar();
		break;
	case 3:
		ControlPedido.selecionar(); // repitido !!
		break;
	case 4:
		TelaPrincipal.mostrar(); //esse funciona
		break;
	}
	leitor.close();
	
}
}