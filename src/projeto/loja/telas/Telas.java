package projeto.loja.telas;
import projeto.loja.modulos.*;
public class Telas {
public static void main(String []args) {

	Pessoa infoPessoa = new Pessoa("Rafael Maylon Mendes", "(43)998264852" , "rafaelkarlmarxs33@gmail.com", "102.564.845-87");
	
	Estoque infoEstoque = new Estoque(531548,215683);	
	
	Produto infoProduto = new Produto("Monitor 244hrtz",  42355410 , 2399.48,infoEstoque);
	
	Funcionario funcionario = new Funcionario(new Pessoa("Jeferson Souza","(43)998264852" , "rafaelkarlmarxs33@gmail.com", "857.354.342-87" ),"11/03/2003", " matutino" , " vespetino");
	
	Gerente gerente = new Gerente ("joao guilherme","jaozinholeiteiro@gmail.com","102.546.874-45","(46)556213599",infoEstoque, funcionario, funcionario );
	
	Cliente infoClientes = new Cliente(infoPessoa, new Pedido(null,null,null),infoProduto);			
	
	Pedido pedido = new Pedido(infoClientes,infoProduto,infoProduto);
	
	Cliente infoCliente = new Cliente(infoPessoa,pedido,infoProduto);
	
	Vendedor vendedor = new Vendedor(new Pessoa ("Wagner Lopes","(43)998264852" , "rafaelkarlmarxs33@gmail.com", "102.564.845-87"), infoCliente, infoProduto, pedido, pedido);
	
	
	
//	System.out.println("o cliente " + infoCliente.getNomeCliente().getNome()+" solicitou o produto " + infoProduto.getNome()+ " o valor do pedido é " + pedido.getValorTotal() + "\nO cpf do Cliente: " + infoCliente.getNomeCliente().getCpf());
//	System.out.println("O pedido foi feito pelo cliente " + pedido.getNomeCliente().getNomeCliente().getNome());
//	System.out.println("O valor do pedido é " + pedido.getValorTotal().getValor());
	
	
	System.out.println("O gerente demitiu "+ gerente.getDemiteFuncionario().getNomeFuncionario().getNome()+
			"\no mesmo que atendeu o cliente " + infoCliente.getNomeCliente().getNome() + "\nesse cliete comprou um " +
	infoCliente.getCompraProduto().getNome()+ "\no cpf de " +
			funcionario.getNomeFuncionario().getNome()+ " é " +funcionario.getNomeFuncionario().getCpf()+ 
			"\no cpf do gerente " + gerente.getCpf()+ 
			"\ne olha que ele contratou esse funcionario para o periodo " + funcionario.getEntrada()+ 
			"\no coitado saia todo dia no periodo " + funcionario.getSaida()+ 
			"\npelomenos ele lucrou bem com " + infoCliente.getCompraProduto().getNome()+ 
			"\nque vendeu para o cliente " + infoCliente.getNomeCliente().getNome() + 
			"\nno valor de: " + vendedor.getVendeProduto().getValor()+
			"\no nome do gerente é " + gerente.getNome() );
			
}
}
