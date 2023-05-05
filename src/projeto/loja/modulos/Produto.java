package projeto.loja.modulos;

public class Produto {
	
	private String nome;
	private int cod_barras;
	private double valor;
	private Estoque verificaEstoque;
	
	public Produto(String nome, int cod_barras, double valor, Estoque verificaEstoque) {
		super();
		this.nome = nome;
		this.cod_barras = cod_barras;
		this.valor = valor;
		this.verificaEstoque = verificaEstoque;
	}

	public String getNome() {
		return nome;
	}

	public int getCod_barras() {
		return cod_barras;
	}

	public double getValor() {
		return valor;
	}

	public Estoque getVerificaEstoque() {
		return verificaEstoque;
	}
	
	

	
	
}
