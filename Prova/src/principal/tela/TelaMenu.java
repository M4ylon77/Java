package principal.tela;

import java.util.Scanner;

public class TelaMenu {

public static void  mostrar() {
	
	Scanner leitor = new Scanner(System.in);
	
	System.out.println("===Menu===");
	System.out.println("\nTela Pacientes [1]"
			+ "\nTela Medicamento [2]");
	int op = leitor.nextInt();
	leitor.nextLine();
	
	
	switch(op) {
	case 1:
		
		TelaPaciente.mostrar();
		
		break;
	case 2:
		
		TelaMedicamento.mostrar();
		
		break;
	
	
	}
	
}
	
}
