package projeto.loja.controller;


import java.util.List;
import java.util.Scanner;
import projeto.loja.modulos.Cadastro;
import projeto.loja.modulos.Headset;
import projeto.loja.modulos.ListaPedido;
import projeto.loja.modulos.Mouse;
import projeto.loja.modulos.Pedido;
import projeto.loja.modulos.Pessoa;
import projeto.loja.modulos.Produto;
import projeto.loja.modulos.Teclado;
import projeto.loja.tela.TelaDePedidos;
import projeto.loja.tela.TelaDeProdutos;
import projeto.loja.util.Mensagem;


public class ControlPedido {
	
	
//	A coisas em comentarios abaixo ainda nao estão sendo utilizadas !! mas possivelmente vao ser usadas!!
//	so uma idea de como continuar agora que to conseguindo trazer as lista para ca a ideia seria utilizar 
//	o objeto ListaPedido linha 31 para criar a lista de pedidos com exito 
	
	public static void selecionar() {
		Scanner leitor = new Scanner (System.in);
		int opcao,i = 0;
		Pessoa pessoa = new Pessoa ();
//		Cadastro cliente = new Cadastro();
//		Produto produto = new Produto();
		Pedido pedido = new Pedido();
//		ListaPedido listaPedido = new ListaPedido();
		
		List<Pessoa> clientes = ControlCliente.getClientes();
		List<Teclado> teclado = ControlProduto.getTecladoLista();
		List<Mouse> mouse = ControlProduto.getMouseLista();
		List<Headset> headset = ControlProduto.getHeadsetLista();
		
//		a função de selecionar os produtos ja esta nessa classe o que precisa ser feito é descomentar para usala e ir arrumando onde 
//		as variaveis estao diferentes no caso siga o exemplo da lista de clientes @!!!!!!!! ate as 21 ! S2
//		
//		
		
		
		System.out.println("[1] Selecionar Cliente\n"
				+ "[2] Selecionar Produto\n"
				+ "[3] Finalizar Pedido!");
		opcao = leitor.nextInt();
		leitor.nextLine();
		
		
		switch(opcao) {
		case 1:
			 for (Pessoa registro : clientes) {
			        i++;
			      
			        System.out.println("\n[" + i+"]" +Mensagem.MSG_NOME + registro.getNome() +
			                            Mensagem.MSG_CPF  + registro.getCpf() +
			                            Mensagem.MSG_TELEFONE + registro.getTelefone()+
			                            Mensagem.MSG_TELEFONE + registro.getEmail());
			    }

			    System.out.println("\n"+Mensagem.EXCLUIR_CLIENTE);
			    opcao = leitor.nextInt();
			    leitor.nextLine();
			    
			    if (opcao > 0 && opcao <= clientes.size()) {
			    	pessoa.setNome(clientes.get( opcao - 1 ).getNome());
			    	
			    	
			       
			     System.out.println("\n"+Mensagem.CLIENTE_SELECIONADO + pessoa.getNome()+"\n");
			     
			     pedido.setPessoa(pessoa);
			    }
			    
			    i=0;
			    TelaDePedidos.mostrar();
			    leitor.close();
			    
			
			
			break;
		}
	}
}
			//Selecionar cliente!!!!
			
//		case 2:
//					
//			  System.out.println(Mensagem.MSG_ESCOLHA);
//			  System.out.println(Mensagem.MSG_TECLADO+
//					       "\n"+ Mensagem.MSG_HEADSET+ 
//					       "\n"+ Mensagem.MSG_MOUSE);
//			  int escolha = leitor.nextInt();  
//			  leitor.nextLine();  
//			  
//			  switch (escolha) {
//			  
//			  case 1:
//			   if(produto.getTeclados().size()==0) {
//				   System.out.println(Mensagem.ADD_PRODUTO);
//				   TelaDeProdutos.mostrar();
//			   }else {
//	 
//			    for (Teclado teclados : produto.getTeclados()) {
//			        i++;
//			        
//			        System.out.println("\nID: ["+i+"]\n"+Mensagem.MSG_MARCA + teclados.getNome() +
//			                            		   Mensagem.MSG_VALOR + teclados.getValor());
//			      
//			    }
//			    
//			    System.out.println(Mensagem.EXCLUIR_CLIENTE);
//			    i = leitor.nextInt();
//			    
//			    if (i > 0 && i <= produto.getTeclados().size()) {
//			    	
//			    	Teclado teclado = new Teclado();
//			       teclado.setNome(produto.getTeclados().get(i-1).getNome());
//			        teclado.setValor(produto.getTeclados().get(i-1).getValor());
//			        
//			        produto.adicionar(teclado);
//			        
//			        
//			        			        
//				       System.out.println(Mensagem.MSG_PRODUTO_SELECIONADO + produto.getTeclados());
//				       
//			    }
//			    System.out.println(Mensagem.PRODUTO_DESEJA_ADD);
//				System.out.println(Mensagem.PRODUTO_CONTINUAR);
//				opcao = leitor.nextInt();
//				
//				
//				switch(opcao) {
//				case 1 :
//					ControlProduto.selecionar();
//					break;
//				case 2:
//					i=0;
//					TelaDePedidos.mostrar();
//					break;
//				}
//				     
//			    leitor.close();
//		
//		 }
//			   break;
//			  case 2:
//				   if(produto.getHeadsets().size()==0) {
//					   System.out.println(Mensagem.ADD_PRODUTO);
//					   TelaDeProdutos.mostrar();
//				   }else {
//		 
//				    for (Headset headsets : produto.getHeadsets()) {
//				        i++;
//				        System.out.println("\nID: ["+i+"]\n"+Mensagem.MSG_MARCA + headsets.getNome() +
//				                            		   Mensagem.MSG_VALOR + headsets.getValor());
//				    }
//
//				    System.out.println(Mensagem.EXCLUIR_CLIENTE);
//				    i = leitor.nextInt();
//				    
//				    if (i > 0 && i <= produto.getHeadsets().size()) {
//				       
//				    	
//						Headset headset = new Headset();
//				    	
//				    	headset.setNome(produto.getHeadsets().get(i - 1).getNome());
//				    	headset.setValor(produto.getHeadsets().get(i-1).getValor());
//				    	
//				    	produto.adicionar(headset);
//
//
//
//					       System.out.println(Mensagem.MSG_PRODUTO_SELECIONADO);
//				    }
//				    i = 0;
//					      TelaDePedidos.mostrar();
//				    leitor.close();
//				
//				   }
//				   break;
//			  case 3:
//				   if(produto.getMouse().size()==0) {
//					   System.out.println(Mensagem.ADD_PRODUTO);
//					   TelaDeProdutos.mostrar();
//				   }else {
//		 
//				    for (Mouse mouses : produto.getMouse()) {
//				        i++;
//				       
//				        System.out.println("\nID: ["+i+"]\n"+Mensagem.MSG_MARCA + mouses.getNome() +
//				                                   Mensagem.MSG_VALOR + mouses.getValor());
//				    }
//
//				    System.out.println(Mensagem.EXCLUIR_CLIENTE);
//
//				    i = leitor.nextInt();
//				    if (i > 0 && i <= produto.getMouse().size()) {
//				    	
//				    	Mouse mouse = new Mouse();
//				    	
//				       mouse.setNome( produto.getMouse().get(i - 1).getNome());
//				       mouse.setValor(produto.getMouse().get(i-1).getValor());
//
//				       produto.adicionar(mouse);
//				       
//				       System.out.println(Mensagem.MSG_PRODUTO_SELECIONADO );
//				    }
//				    i = 0;
//				      TelaDePedidos.mostrar();
//				    leitor.close();
//				   
//				   
//			   }
//				   
//			break;
//			
//			  }
//			  //Selecionar Produto!!!
//			
//			pedido.setProduto(produto);
//			
//			
//			
//		case 3:
//			
//			listaPedido.adicionar(pedido);
//			
//			for (Pedido pedidos : listaPedido.getPedido()) {
//					System.out.println("\nnome: " + pedidos.getPessoa()+"\n"
//							+ "nome produto: " + pedidos.getProduto()+""
//									+ "\nvalor: "+ pedidos.getValor());
//					
//				
//				
//			}
//			
			
//			break;
		//finaliar pedido!!
		
		


