package projeto.loja.relatorio;

import projeto.loja.modulos.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.util.Formatter;

public class Relatorio {
	
	public Relatorio(Produto produto , Cliente cliente) {
		
		try {
			File arquivo = new File("C:\\_src\\ws\\Escopo\\src\\projeto\\loja\\relatorio\\Relatorio.txt");// 
			Formatter gravador = new Formatter(arquivo);
			
			
			
			gravador.format("Cliente: "+cliente.getNome()+
					"\nID: "+cliente.getFazPedido().getId()+
					"\n===Informações do produto === \n"
				 +cliente.getFazPedido().getProduto().getTeclados().get(1).getNome()+
					"\nValor: "+cliente.getFazPedido().getProduto().getTeclados().get(1).getValor());
			
			
			gravador.close();
			
		}catch(Exception e) {
			
			System.out.println("nao foi dessa vez! " + e.getMessage());
			
		}
		
		
	}
	
	
}
