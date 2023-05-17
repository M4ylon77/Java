package principal;

public class Pessoa {
	
	private String nome;
	private String cpf;
	private Double peso;
	private int idPessoa;
	
	
	public Pessoa(String nome, String cpf, Double peso, int idPessoa) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.peso = peso;
		this.idPessoa = idPessoa;
	}


	public String getNome() {
		return nome;
	}


	public String getCpf() {
		return cpf;
	}


	public Double getPeso() {
		return peso;
	}


	public int getIdPessoa() {
		return idPessoa;
	}
	
	
	
	
}
