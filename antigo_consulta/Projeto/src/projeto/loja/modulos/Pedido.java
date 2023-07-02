package projeto.loja.modulos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	
	
	private int id;
	private String produto;
	private String  pessoa;
	
	public String getProduto() {
		return produto;
	}
	public void setProduto(String produto) {
		this.produto = produto;
	}
	public String getPessoa() {
		return pessoa;
	}
	public void setPessoa(String pessoa) {
		this.pessoa = pessoa;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	
}
