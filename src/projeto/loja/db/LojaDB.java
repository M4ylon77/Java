package projeto.loja.db;
import projeto.loja.modulos.*;

public class LojaDB {

	private Pedido nomePedido;
	private Pedido nomeCliente;
	private Pedido valorTotal;
	
	public LojaDB(Pedido nomePedido, Pedido nomeCliente, Pedido valorTotal) {
		super();
		this.nomePedido = nomePedido;
		this.nomeCliente = nomeCliente;
		this.valorTotal = valorTotal;
	}

	public Pedido getNomePedido() {
		return nomePedido;
	}

	public Pedido getNomeCliente() {
		return nomeCliente;
	}

	public Pedido getValorTotal() {
		return valorTotal;
	}
	
	
}
