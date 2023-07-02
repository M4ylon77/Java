package principal;

import java.util.Scanner;

public class Tela {
	public static void telaunique() {
		
		Scanner leitor = new Scanner(System.in);
		Pessoa p = new Pessoa("lex luthor","1535156431", 72.12, 2);	
			
		System.out.println("=====escolha=====\n"
				+ "[1]-listar\n"
				+ "[2]-adicionar\n"
				+ "[3]-alterar\n"
				+ "[4]-excluir");
		int escolha = leitor.nextInt();
		
		switch(escolha) {

		case 1:
			
			Programa.listar();
			
		break;
		
		case 2: 
			
			Programa.criar();
			
			break;
		
		case 3:
			
			Programa.alterar(p);
			
			break;
		case 4 :
			
			Programa.excluir(5);
			
			break;
		}	
		leitor.close();
	}
		
		
	}
	

