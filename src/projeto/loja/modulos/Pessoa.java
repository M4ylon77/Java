package projeto.loja.modulos;

public class Pessoa {
	
	private String nome;
	private String numeroTelefone;
	private String email;
	private String cpf;
	
	public Pessoa(String nome, String numeroTelefone, String email, String cpf) {
		this.nome=nome;
		this.numeroTelefone=numeroTelefone;
		this.email=email;
		this.cpf=cpf;
		
		
	}
	
	public String getNome() {
		return nome;
		
	}
	public String getNumeroTelefone() {
		return numeroTelefone;
		
	}
	public String getEmail() {
		return email;
		
	}
	public String getCpf() {
		return cpf;
		
	}
	
}
