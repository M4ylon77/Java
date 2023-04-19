package projeto.loja.modulos;

public class Gerente {
	private Pessoa identificacao;
	private Estoque controlaEstoque;
	private Funcionario contrataFuncionario;
	private Funcionario demiteFuncionario;
	
	public Gerente(Pessoa identificacao, Estoque controlaEstoque, Funcionario contrataFuncionario, Funcionario demiteFuncionario) {
		super();
		this.identificacao=identificacao;
		this.controlaEstoque = controlaEstoque;
		this.contrataFuncionario = contrataFuncionario;
		this.demiteFuncionario = demiteFuncionario;
	}

	public Pessoa getIdentificacao() {
		return identificacao;
	}

	public Estoque getControlaEstoque() {
		return controlaEstoque;
	}

	public Funcionario getContrataFuncionario() {
		return contrataFuncionario;
	}

	public Funcionario getDemiteFuncionario() {
		return demiteFuncionario;
	}
	
	
	
}
