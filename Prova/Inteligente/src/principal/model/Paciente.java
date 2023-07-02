package principal.model;

import java.util.*;
import jakarta.persistence.*;

@Entity
public class Paciente {

    @Id
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Integer id;
    private Integer codigo;
    private String nome;

    @OneToMany
    private List<Medicamento> medicamentos = new ArrayList<>();

    public Paciente(){

    }

    public Paciente(Integer codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
    }

    public Paciente(Integer codigo, String nome, List<Medicamento> medicamentos){
        this.codigo = codigo;
        this.nome = nome;
        this.medicamentos = medicamentos;
    }

    //FUNÇÃO PARA ADICIONAR ENDEREÇOS
    public void addMedicamento(Medicamento medicamento){
    this.medicamentos.add(medicamento);
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Medicamento> getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(List<Medicamento> medicamentos) {
        this.medicamentos = medicamentos;
    }
}
