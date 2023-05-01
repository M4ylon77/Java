package projeto.loja.relatorio;

import projeto.loja.listas.ListaProduto;
import projeto.loja.modulos.Headset;
import projeto.loja.modulos.Mouse;
import projeto.loja.modulos.Teclado;

//package projeto.loja.relatorio;
//
//import java.util.ArrayList;
//
//import projeto.loja.dados.Produto;
//import projeto.loja.modulos.Teclado;
//
//public class  {
//
//	public static void imprimirListaProdutos() {
//	    Produto estoque = new Produto();
//	    ArrayList<Produto> listaProdutos = estoque.getTeclados;
//	    
//	    for(Produto produto : listaProdutos) {
//	        System.out.println("Nome: " + produto.getNome() + "\nValor: " + produto.getValor());
//	    }
//	}
//
//}public class TelaListarProdutos {

    public class Declaration{
    	

		public static void telapro(ListaProduto produto ) {
        if(produto.getTeclados().size()==0 && produto.getMouse().size()==0 && produto.getHeadsets().size()==0) {
            System.out.println("\n====Ainda nao ha produtos listados====");
        }
        
        if(produto.getTeclados().size() == 0) {
            System.out.println();
        } else {
            System.out.println("===Lista de produtos===\n");
            System.out.println("===Teclados===\n");
            for(Teclado teclados : produto.getTeclados()) {
                System.out.println("Nome:"+teclados.getNome()+
                        "\nValor:" +teclados.getValor()+"\n");
                System.out.flush();
            }
        }
        
        if(produto.getMouse().size() == 0) {
            System.out.println();
        } else {
            System.out.println("\n===Mouses===");
            for(Mouse mouse : produto.getMouse()) {
                System.out.println("Nome: " + mouse.getNome()+"\nValor: "+ mouse.getValor());
                System.out.flush();
            }
        }
        
        if(produto.getHeadsets().size() == 0) {
            System.out.println();
        } else {
            System.out.println("\n===Headsets===");
            for(Headset headset : produto.getHeadsets()) {
                System.out.println("Nome: " + headset.getNome()+"\nValor: "+ headset.getValor());
                System.out.flush();
            }
        }
    }
    
    
  }
