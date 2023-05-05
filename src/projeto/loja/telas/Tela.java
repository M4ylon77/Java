package projeto.loja.telas;
import java.util.Formatter;
import java.io.FileNotFoundException;
import projeto.loja.modulos.*;
import java.util.Scanner;
public class Tela {
	public static void main(String[]args)throws FileNotFoundException {
		Scanner leitor = new Scanner (System.in);
		String Relatorio = "C:\\_src\\ws\\Projeto\\src\\projeto\\loja\\relatorio\\Relatorio.txt";	
		Formatter gravador = new Formatter(Relatorio);

		
		
		Pessoa infoPessoa = new Pessoa("Rafael Maylon Mendes", "(43)998264852" , "rafaelkarlmarxs33@gmail.com", "102.564.845-87");
		
		Estoque infoEstoque = new Estoque(35,215683);	
		
		Produto infoProduto = new Produto("Monitor 244hrtz",  42355410 , 2399.48,infoEstoque);
		
		Funcionario funcionario = new Funcionario(new Pessoa("Jeferson Souza","(43)998264852" , "rafaelkarlmarxs33@gmail.com", "857.354.342-87" ),"11/03/2003", " matutino" , " vespetino");
		
		Gerente gerente = new Gerente ("João guilherme","jaozinholeiteiro@gmail.com","102.546.874-45","(46)556213599",infoEstoque, funcionario, funcionario );		
		
		Pedido pedido = new Pedido(new Cliente(infoPessoa,new Pedido(null,null,null),infoProduto),infoProduto,infoProduto);
		
		Cliente infoCliente = new Cliente(infoPessoa,pedido,infoProduto);
		
		Vendedor vendedor = new Vendedor(funcionario, infoCliente, infoProduto, pedido, pedido);
		
		//Aqui mostramos na tela!!
			
		System.out.println("Cliente: " + infoCliente.getNomeCliente().getNome()+
				"\nCpf: "+ infoCliente.getNomeCliente().getCpf()+
				"\nNumero de contato: "+infoCliente.getNomeCliente().getNumeroTelefone()+
				"\nEmail: " + infoCliente.getNomeCliente().getEmail());
				
		System.out.println("\nProduto comprado: " + infoCliente.getCompraProduto().getNome());
		System.out.println("\nPreço: " + infoCliente.getCompraProduto().getValor());
		System.out.println("\nQuantidade no estoque: "+ infoProduto.getVerificaEstoque().getQuantidade());
		System.out.println("\nAtendido pelo vendedor: " + vendedor.getIdentificacao().getNomeFuncionario().getNome());
		System.out.println("\nGerente da loja: "+ gerente.getNome());
		
		//Aqui geramos um relatorio em formato de texto!!
		
		gravador.format("Cliente: " + infoCliente.getNomeCliente().getNome()+
		"\nCpf: "+ infoCliente.getNomeCliente().getCpf()+
		"\nNumero de contato: "+infoCliente.getNomeCliente().getNumeroTelefone()+
		"\nEmail: " + infoCliente.getNomeCliente().getEmail());
		gravador.format("\n\nProduto comprado: " + infoCliente.getCompraProduto().getNome());
		gravador.format("\nPreço: " + infoCliente.getCompraProduto().getValor());
		gravador.format("\nQuantidade no estoque: "+ infoProduto.getVerificaEstoque().getQuantidade());
		gravador.format("\nAtendido pelo vendedor: " + vendedor.getIdentificacao().getNomeFuncionario().getNome());
		gravador.format("\nGerente da loja: "+ gerente.getNome());


gravador.close();
//
	
	
//	System.out.println("o cliente " + infoCliente.getNomeCliente().getNome()+" solicitou o produto " + infoProduto.getNome()+ " o valor do pedido é " + pedido.getValorTotal() + "\nO cpf do Cliente: " + infoCliente.getNomeCliente().getCpf());
//	System.out.println("O pedido foi feito pelo cliente " + pedido.getNomeCliente().getNomeCliente().getNome());
//	System.out.println("O valor do pedido é " + pedido.getValorTotal().getValor());
	
	
//	System.out.println("O gerente demitiu "+ gerente.getDemiteFuncionario().getNomeFuncionario().getNome()+
//			"\no mesmo que atendeu o cliente " + infoCliente.getNomeCliente().getNome() + "\nesse cliete comprou um " +
//	infoCliente.getCompraProduto().getNome()+ "\no cpf de " +
//			funcionario.getNomeFuncionario().getNome()+ " é " +funcionario.getNomeFuncionario().getCpf()+ 
//			"\no cpf do gerente " + gerente.getCpf()+ 
//			"\ne olha que ele contratou esse funcionario para o periodo " + funcionario.getEntrada()+ 
//			"\no coitado saia todo dia no periodo " + funcionario.getSaida()+ 
//			"\npelomenos ele lucrou bem com " + infoCliente.getCompraProduto().getNome()+ 
//			"\nque vendeu para o cliente " + infoCliente.getNomeCliente().getNome() + 
//			"\nno valor de: " + vendedor.getVendeProduto().getValor()+
//			"\no nome do gerente é " + gerente.getNome() );
//	
	//	System.out.println("Cliente:");
//	System.out.println("Cliente:");

}
}
