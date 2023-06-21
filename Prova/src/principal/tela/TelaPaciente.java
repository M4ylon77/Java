package principal.tela;

import java.util.Scanner;

import principal.controller.PacienteController;

public class TelaPaciente {

public static void mostrar() {
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("====tela paciente===");
	System.out.println("\nOque deseja?"
			+ "\nCadastrar: [1]"
			+ "\nListar: [2]"
			+ "\nAtualizar: [3]"
			+ "\nDeletar: [4]"
			+ "\nvoltar [5]");
			
	int op = leitor.nextInt();
	
	switch(op) {
	case 1 :
		
		PacienteController.salvar();
		
	break;
	case 2 :
		
		PacienteController.listar();
		
	break;
		
	case 3 :
		
		PacienteController.atualizar();
		
	break;
		
	case 4 :
		
		PacienteController.deletar();
		
	break;

	case 5 :
		
		TelaMenu.mostrar();

		
	break;
			
	
	}
	
}
	
}
