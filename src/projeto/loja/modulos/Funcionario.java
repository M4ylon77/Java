package projeto.loja.modulos;

public class Funcionario {
	private Pessoa nomeFuncionario;
	private String dataAdm;
	private String entrada;
	private String saida;
	
	public Funcionario(Pessoa nomeFuncionario, String dataAdm, String entrada, String saida) {
		super();
		this.nomeFuncionario=nomeFuncionario;
		this.dataAdm = dataAdm;
		this.entrada = entrada;
		this.saida = saida;
	}

	public Pessoa getNomeFuncionario() {
		return nomeFuncionario;
	}

	public String getDataAdm() {
		return dataAdm;
	}

	public String getEntrada() {
		return entrada;
	}

	public String getSaida() {
		return saida;
	}
	
	
	
}
