package principal.model;

import jakarta.persistence.*;

@Entity
public class Medicamento {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

    @ManyToOne
    private Paciente paciente;

    public Medicamento(){

    }

    public Medicamento(String nome, Paciente paciente){
        this.nome = nome;
        this.paciente = paciente;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }
}
