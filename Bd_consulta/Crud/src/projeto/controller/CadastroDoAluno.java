package projeto.controller;

import java.util.Scanner;

import jakarta.persistence.*;
import projeto.model.Aluno;


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
	
	
}
