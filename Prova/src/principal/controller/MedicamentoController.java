package principal.controller;

import java.util.List;
import java.util.Scanner;

import principal.daos.DAO;
import principal.daos.MedicamentoDAO;
import principal.model.Medicamento;
import principal.model.Paciente;
import principal.tela.TelaMedicamento;
import principal.tela.TelaPaciente;

public class MedicamentoController {

	private static DAO<Medicamento> dao = new MedicamentoDAO();
	
	static Scanner leitor = new Scanner(System.in);

	
	public static void salvar() {
		
//
//		Evento e = ...;
//		Categoria c = ...;
//		e.setCategoria(c);
//		c.eventos.add(e);

		
		Medicamento medicamento = new Medicamento();
		
		
		medicamento.setNome("Paracetamol");
		
		dao.salvar(medicamento);
		
		TelaMedicamento.mostrar();
		 
		
	}

	public static void atualizar() {
		

		List<Medicamento> lista = dao.listar();
		System.out.println("\n===Lista de Medicamentos!===");
		int id =0;
		for(Medicamento medicamento : lista ) {
			id++;
			System.out.println("id: "+id+" nome: " + medicamento.getNome());
			
		}
		
		
		
		System.out.println("\nQual deseja atualizar?");
		id = leitor.nextInt();
		
		Medicamento medicamento = dao.buscarPorId(id);
		
		medicamento.setNome("Benzetacil0,56");
		
		dao.atualizar(medicamento);
		
		
		TelaMedicamento.mostrar();

		
	}

	public static void listar() {
		
		List<Medicamento> lista = dao.listar();
		
		System.out.println("\n===Lista de Medicamentos!===");
		
		for(Medicamento medicamento : lista ) {
			System.out.println("nome: " + medicamento.getNome());
			
		}
		
		TelaMedicamento.mostrar();
		
		
		
	}

	public static void deletar() {
		

		List<Medicamento> lista = dao.listar();
	int id =0;
	for(Medicamento medicamento : lista ) {
		id++;
		System.out.println("id: "+id+" nome: " + medicamento.getNome());
		
	}
	
	System.out.println("\nQual deseja excluir?");
	id = leitor.nextInt();
	
	
	dao.excluir(id);
	
	System.out.println("\n===Excluido com sucesso===\n");
	TelaMedicamento.mostrar();
		
	}

	
	
}
