package projeto.loja.tela;
import projeto.loja.modulos.*;
import projeto.loja.relatorio.*;

public class Tela {
public static void main(String[] args) {
	
	Mouse MouseRazer = new Mouse("Mouse Razer",123);
	Mouse MouseHyperx = new Mouse("Mouse Hyperx",123);
	
	Teclado TecladoRazer = new Teclado("Teclado Razer",123);
	Teclado TecladoHyperx = new Teclado("Teclado Hyperx",2415);
	
	Headset HeadsetRazer = new Headset("Headset cobra",232);
	
	Produto produto = new Produto();
	
	produto.adicionar(MouseHyperx);
	produto.adicionar(TecladoRazer);
	produto.adicionar(TecladoHyperx);
	produto.adicionar(HeadsetRazer);
	
	System.out.println("\n===Lista de Teclado===\n");
	
	for(Teclado teclado : produto.getTeclados()) {
		System.out.println("Nome: "+TecladoHyperx.getNome());
		System.out.println("Valor: "+TecladoHyperx.getValor());
	}
	
	System.out.println("\n===Lista de mouses===\n");
	for(Mouse mouses : produto.getMouse()){
	
		System.out.println("Nome: "+MouseHyperx.getNome());
		System.out.println("Valor: "+MouseHyperx.getValor());
		
	}
	
	System.out.println("\n===Lista de Headsets===\n");
	
	for(Headset headsets : produto.getHeadsets()){
		
		System.out.println("Nome: "+HeadsetRazer.getNome());
		System.out.println("Valor: "+HeadsetRazer.getValor());
		
	}
	


	Cliente clientes = new Cliente("Junin","0213984192",
			"(79)9999-9999","eduzinhoamassa@gmail.com",new Pedido (1,produto));
	
	

	
	
	
	
	System.out.println("Cliente: "+clientes.getNome()+
			"\nID: "+clientes.getFazPedido().getId()+
			"\n===Informações do produto === \n"
		 +clientes.getFazPedido().getProduto().getTeclados().get(1).getNome()+
			"\nValor: "+clientes.getFazPedido().getProduto().getTeclados().get(1).getValor());
	
	

	Relatorio relatorio = new Relatorio(produto, clientes);

		
		
	
	}
}
