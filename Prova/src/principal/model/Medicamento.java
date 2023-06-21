package principal.model;
import jakarta.persistence.*;

@Entity
public class Medicamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	private String nome;

	public String getNome() {
		return nome;
	}

	@ManyToOne
	@JoinColumn(name ="paciente_id")
	private Paciente paciente;

	

	public Medicamento() {
		
	}
	
	public Paciente getPaciente() {
		return paciente;	
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}

	
	public Medicamento(String nome) {
		this.nome = nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
	
}
