package projeto.loja.controller;
import projeto.loja.modulos.*;
import projeto.loja.util.Mensagem;
import java.util.Scanner;
import projeto.loja.modulos.Pessoa;
import projeto.loja.tela.TelaDeClientes;
import projeto.loja.tela.TelaPrincipal;



public class ControlCliente {

	static Cadastro registro = new Cadastro();
	static int i;
	public static void cadastrar() {
		
		System.out.println(Mensagem.CADASTRO_CLIENTES);
		Scanner leitor = new Scanner(System.in);
		
		
		String nome,cpf,email,telefone;
		int opcao;
		System.out.println(Mensagem.CADASTRA_NOME);
		nome = leitor.nextLine();
		
		System.out.println(Mensagem.CADASTRA_CPF);
		cpf = leitor.nextLine();
		
		System.out.println(Mensagem.CADASTRA_TELEFONE);
		telefone = leitor.nextLine();
		
		System.out.println(Mensagem.CADASTRA_EMAIL);
		email = leitor.nextLine();
		
		registro.adicionar(new Pessoa(nome,cpf,telefone,email));
		
		System.out.println("\n"+Mensagem.MSG_CLIENTE+nome+"\n");
		
		TelaDeClientes.mostrar();
		leitor.close();
	}
	
	public static void listar() {
		if(registro.getPessoa().size()== 0) {
			
			System.out.println("\n"+Mensagem.CLIENTE_NULLO+"\n");
			
		}else {
		
			System.out.println("\n"+Mensagem.TELA_LISTA_CLIENTES);
		
			for(Pessoa registro : registro.getPessoa()) {
			System.out.println("\nNOME: "+registro.getNome()+
							    "\nCPF: "+registro.getCpf()+
							    "\nTELEFONE: "+registro.getEmail()+"\n");
			System.out.flush();
			}
		}
		
		TelaDeClientes.mostrar();
	}
	
	public static void excluir() {
	    Scanner leitor = new Scanner(System.in);
	    String cpf;
	   

	    for (Pessoa registro : registro.getPessoa()) {
	        i++;
	        System.out.println("ID: " + i);
	        System.out.println("NOME: " + registro.getNome() +
	                            "\nCPF: " + registro.getCpf() +
	                            "\nTELEFONE: " + registro.getEmail());
	    }

	    System.out.println(Mensagem.EXCLUIR_CLIENTE);

	    i = leitor.nextInt();
	    if (i > 0 && i <= registro.getPessoa().size()) {
	        registro.getPessoa().remove(i - 1);
	        System.out.println("Registro removido com sucesso!");
	    } else {
	        System.out.println("ID inválido, por favor tente novamente.");
	    }
	    ControlCliente.listar();
	    leitor.close();
	}
		public static void atualizar() {
			Scanner leitor = new Scanner (System.in);
			
			System.out.println(Mensagem.ATUALIZAR_CLIENTE);
			
		}
		
		
		
		
		
	}
	

