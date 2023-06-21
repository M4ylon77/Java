package principal.model;

import java.util.List;

import jakarta.persistence.*;

@Entity
public class Paciente {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;
	
	private int codigo;
	
	@OneToMany(mappedBy = "paciente")		
	private List<Medicamento>medicamento;
	
	public Paciente() {
		
	}
	
	public Paciente(String nome, int codigo) {
		super();
		this.nome = nome;
		this.codigo = codigo;
	}		
	
	

    public List<Medicamento> getMedicamento() {
        return medicamento;
    }

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	
	
}
