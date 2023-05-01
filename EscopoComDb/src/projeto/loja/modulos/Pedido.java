package projeto.loja.modulos;

import java.util.List;

import projeto.loja.listas.ListaProduto;

public class Pedido {
	
	private int id;
	private ListaProduto produto;
	
	public Pedido(int id, ListaProduto produto) {
			super();
			this.id = id;
			this.produto = produto;
	
	}
	public ListaProduto getProduto() {
		return produto;
	}
	public int getId() {
		return id;
	}
	
}
