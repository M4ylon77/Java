package principal.model;


import jakarta.persistence.*;

@Entity
public class Livro {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int id;

private String nome;


public Livro() {
	
}

public Livro(String nome, Double valor) {
	
	this.nome = nome;
	this.valor = valor;
}

public String getNome() {
	return nome;
}

public void setNome(String nome) {
	this.nome = nome;
}

public Double getValor() {
	return valor;
}

public void setValor(Double valor) {
	this.valor = valor;
}

private Double valor;
	
}
