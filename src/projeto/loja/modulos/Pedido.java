package projeto.loja.modulos;

public class Pedido {
	private Cliente nomeCliente;
	private Produto listaPedido;
	private Produto valorTotal;
	
	public Pedido(Cliente nomeCliente, Produto listaPedido, Produto valorTotal) {
		super();
		this.nomeCliente = nomeCliente;
		
		this.listaPedido = listaPedido;
		this.valorTotal = valorTotal;
	}

	public Cliente getNomeCliente() {
		return nomeCliente;
	}


	public Produto getListaPedido() {
		return listaPedido;
	}

	public Produto getValorTotal() {
		return valorTotal;
	}

	
	
	
}
