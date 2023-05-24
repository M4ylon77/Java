package principal;

import java.util.List;
import java.util.Scanner;

import jakarta.persistence.*;
import principal.model.Pessoa;

public class Programa {

	static EntityManagerFactory emf = Persistence.createEntityManagerFactory("ex_mysql");
	static EntityManager em = emf.createEntityManager();
	
	public static void main(String[] args) {
		
		
		int opcao ;
		Scanner leitor = new Scanner(System.in);
		
		
		
//		configuração do JPA
		
	
		
	
		
		System.out.println("informe");
		opcao= leitor.nextInt();
		//gravação de pessoa no db
		
		switch (opcao) {
		
		case 1:
			Pessoa pessoa = new Pessoa("Ana","123456");
			salvar(pessoa);
		
		break;
		
		case 2:
			
			List<Pessoa>lista = listar();
			for(Pessoa pessoa1 : lista) {
				System.out.println("id: " + pessoa1.getId() +" nome: " + pessoa1.getNome() + " cpf: " + pessoa1.getCpf() );
				
			}
			
			
			break;

		case 3:
			
			Pessoa p2 = buscar(1);
			System.out.println("id: " + p2.getId() +" nome: " + p2.getNome() + " cpf: " + p2.getCpf() );
			
			
			break;
		case 4:
			
			excluir(1);
			
			Pessoa p3 = buscar(1);
			System.out.println("id: " + p3.getId() +" nome: " + p3.getNome() + " cpf: " + p3.getCpf() );
			
				
			
			
			break;
			
	}

	
		
	}
	public static Integer excluir(Integer id) {
		Pessoa p = em.find(Pessoa.class, id);
		em.getTransaction().begin();
		em.remove(p);
		em.getTransaction().commit();
		
		return p.getId();
		
	}
	
	public static Pessoa buscar(Integer id) {
		Pessoa pessoa =em.find(Pessoa.class, id);
		return pessoa;
		
	}
	
	
	public static List<Pessoa> listar(){
		List<Pessoa> Lista= em.createQuery("from Pessoa", Pessoa.class).getResultList();
		return Lista;
		
	}
	
	public static Integer salvar(Pessoa pessoa) {

		//gravação de pessoa no db
		em.getTransaction().begin();
		em.persist(pessoa);
		em.getTransaction().commit();
		return pessoa.getId();
		
	
		
	}
}
