package projeto.loja.modulos;

public class Gerente extends Pessoa {

    private Estoque controlaEstoque;
    private Funcionario contrataFuncionario;
    private Funcionario demiteFuncionario;

    public Gerente(String nome,String email, String numeroTelefone, String cpf, Estoque controlaEstoque, Funcionario contrataFuncionario, Funcionario demiteFuncionario) {
        super(nome,email ,cpf, numeroTelefone );
        this.controlaEstoque = controlaEstoque;
        this.contrataFuncionario = contrataFuncionario;
        this.demiteFuncionario = demiteFuncionario;
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
