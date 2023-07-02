package principal.controller;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.*;
import principal.model.Aluno;


public class CadastroDoAluno {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ex_mysql");
	static EntityManager em = emf.createEntityManager();
	static Scanner leitor = new Scanner(System.in);
	
	public static void create() {
		
		System.out.println("Nome:");
		String nome = leitor.nextLine();
		
		Aluno aluno = new Aluno(nome);
		
		em.getTransaction().begin();
		em.persist(aluno);
		em.getTransaction().commit();
		
		
		
		
	}
	
	public static void listar() {
		List<Aluno> listas = lista();
		for(Aluno aluno : listas) {
			System.out.println("nome:" + aluno.getNome() + "\n");
		}
	}
	

	public static List<Aluno> lista(){
		List<Aluno> Lista= em.createQuery("from Aluno", Aluno.class).getResultList();
		return Lista;
		
		
	}
	
	public static void atualização() {
		
		System.out.println("id?");
		int id = leitor.nextInt();
		leitor.nextLine();
		
		Aluno alunoparaatt = buscarPorId(id);
		
		
		
		System.out.println("Nome:");
		String nome = leitor.nextLine();
		
		alunoparaatt.setNome(nome);
		
		atualizar(alunoparaatt);
		
		

//		Pessoa pessoaParaAtualizar = buscar(1); // Busca a pessoa que deseja atualizar
//		pessoaParaAtualizar.setNome("Novo nome"); // Modifica o nome da pessoa
//		pessoaParaAtualizar.setCpf("Novo CPF"); // Modifica o CPF da pessoa
//		atualizar(pessoaParaAtualizar); // Atualiza a pessoa no banco de dados
//
		
	}
	
	public static void deletar() {
		System.out.println("id?");
		int id = leitor.nextInt();
		leitor.nextLine();
		
		Aluno deleteAluno = buscarPorId(id);

		excluir(deleteAluno);
		
		
	}
	
	public static void atualizar(Aluno aluno) {		
		em.getTransaction().begin();
		em.merge(aluno);
		em.getTransaction().commit();
		
	}
	
	
	public static Aluno buscarPorId(Integer id) {
		Aluno aluno = em.find(Aluno.class, id); 
		return aluno;
		
	}
	
	public static void excluir(Aluno  pessoa) {
		em.getTransaction().begin();
		em.remove(pessoa);
		em.getTransaction().commit();
		
	}
	
	
	
}
