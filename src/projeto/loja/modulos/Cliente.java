package projeto.loja.modulos;
import projeto.loja.modulos.*;

public class Cliente {
	private Pessoa nomeCliente;
	private Pedido fazPedido;
	private Produto compraProduto;
	
	public Cliente(Pessoa nomeCliente,Pedido fazPedido, Produto compraProduto) {
		super();
		this.nomeCliente=nomeCliente;
		this.fazPedido = fazPedido;
		this.compraProduto = compraProduto;
	}

	public Pessoa getNomeCliente() {
		return nomeCliente;
	}

	public Pedido getFazPedido() {
		return fazPedido;
	}

	public Produto getCompraProduto() {
		return compraProduto;
	}

}
