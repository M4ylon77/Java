package projeto.loja.modulos;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
	private List<Pedido> pedido = new ArrayList<Pedido>();
	
	private int id;
	private Produto produto;
	
	public void adicionar(Pedido pedido) {
		this.pedido.add(pedido);
	}
	public void remover(Pedido pedido) {
		this.pedido.remove(pedido);
	}
	public  List<Pedido> getPedido(){
		return pedido;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public Produto getProduto() {
		return produto;
	}
	public int getId() {
		return id;
	}
	
}
