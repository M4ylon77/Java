package principal.tela;

import java.util.Scanner;

import principal.controller.MedicamentoController;

public class TelaMedicamento {


public static void mostrar() {
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("====tela medicamento===");
	System.out.println("\nOque deseja?"
			+ "\nCadastrar: [1]"
			+ "\nListar: [2]"
			+ "\nAtualizar: [3]"
			+ "\nDeletar: [4]"
			+ "\nvoltar [5]");
			
	int op = leitor.nextInt();
	
	switch(op) {
	case 1 :
		MedicamentoController.salvar();
	break;
	case 2 :
		MedicamentoController.listar();
	break;
		
	case 3 :
		MedicamentoController.atualizar();
	break;
		
	case 4 :
		MedicamentoController.deletar();
	break;

	case 5 :
		TelaMenu.mostrar();
	break;
	
	}		
	
	}
	
	
}
