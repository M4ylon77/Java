package principal.controller;

import java.util.List;
import java.util.Scanner;

import principal.daos.DAO;
import principal.daos.PacienteDAO;
import principal.model.Paciente;
import principal.tela.TelaPaciente;

public class PacienteController {

	private static DAO<Paciente> dao = new PacienteDAO();
 	
	static Scanner leitor = new Scanner(System.in);

	
public static void salvar() {
	
	Paciente paciente =new Paciente();
	
	paciente.setCodigo(1235545621);
	paciente.setNome("Renata val Maylon");
	
	dao.salvar(paciente);
	
	TelaPaciente.mostrar();
	 
}

public static void atualizar() {

	

	List<Paciente> lista = dao.listar();
	System.out.println("===Lista de pacientes!===");
	int id =0;
	for(Paciente paciente : lista ) {
		id++;
		System.out.println("id: "+id+" nome: " + paciente.getNome() + "codigo: " + paciente.getCodigo());
		
	}
	
	
	
	System.out.println("\nQual deseja atualizar?");
	id = leitor.nextInt();
	
	Paciente paciente = dao.buscarPorId(id);
	
	paciente.setCodigo(777777);
	paciente.setNome("Sandro Gabriel Batista");
	
	dao.atualizar(paciente);
	
	
	TelaPaciente.mostrar();

	
	
}

public static void listar() {
	
	List<Paciente> lista = dao.listar();
	
	System.out.println("===Lista de pacientes!===");
	
	for(Paciente paciente : lista ) {
		System.out.println("nome: " + paciente.getNome() + "codigo: " + paciente.getCodigo());
		
	}
	
	TelaPaciente.mostrar();
	
}

public static void deletar() {
	
List<Paciente> lista = dao.listar();
	int id =0;
	for(Paciente paciente : lista ) {
		id++;
		System.out.println("id: "+id+" nome: " + paciente.getNome() + "codigo: " + paciente.getCodigo());
		
	}
	
	System.out.println("\nQual deseja excluir?");
	id = leitor.nextInt();
	
	
	dao.excluir(id);
	
	System.out.println("\n===Excluido com sucesso===\n");
	TelaPaciente.mostrar();
	
}

	
}
