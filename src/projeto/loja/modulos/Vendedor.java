package projeto.loja.modulos;

public class Vendedor {
	private Pessoa identificacao;
	private Cliente atendeCliente;
	private Produto vendeProduto;
	private Pedido verificaPedido;
	private Pedido cadastraPedido;
	
	public Vendedor(Pessoa identificacao, Cliente atendeCliente, Produto vendeProduto, Pedido verificaPedido, Pedido cadastraPedido) {
		super();
		this.identificacao= identificacao;
		this.atendeCliente = atendeCliente;
		this.vendeProduto = vendeProduto;
		this.verificaPedido = verificaPedido;
		this.cadastraPedido = cadastraPedido;
	}

	public Pessoa getIdentificacao() {
		return identificacao;
	}

	public Cliente getAtendeCliente() {
		return atendeCliente;
	}

	public Produto getVendeProduto() {
		return vendeProduto;
	}

	public Pedido getVerificaPedido() {
		return verificaPedido;
	}

	public Pedido getCadastraPedido() {
		return cadastraPedido;
	}
	
	
	
	
}
