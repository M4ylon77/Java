package projeto.loja.controller;

import java.util.Scanner;

import projeto.loja.modulos.Cadastro;
import projeto.loja.modulos.Headset;
import projeto.loja.modulos.ListaPedido;
import projeto.loja.modulos.Mouse;
import projeto.loja.modulos.Pedido;
import projeto.loja.modulos.Pessoa;
import projeto.loja.modulos.Produto;
import projeto.loja.modulos.Teclado;
import projeto.loja.tela.TelaDeClientes;
import projeto.loja.tela.TelaDePedidos;
import projeto.loja.util.Mensagem;

public class ControlPedido {
	static ListaPedido compra = new ListaPedido();
	static Cadastro registro = new Cadastro();
	static Produto estoque =new Produto();
	static Pessoa pessoa = new Pessoa();
	static String cliente;
	static int i;
	
	public static void selecionar() {
		Scanner leitor = new Scanner (System.in);
	ControlProduto produto = new ControlProduto();
	ControlCliente cliente = new ControlCliente();
	Pedido pedido = new Pedido();

	
	pedido.setProduto(produto.getTeclado());
	pedido.setPessoa(cliente.cliente);
	
	compra.adicionar(pedido);
	
	
	
	
	for (Pedido pedidos : compra.getPedido()) {
		System.out.println(
				"\nnome do cliente"+	pedidos.getPessoa()+
				" \nnome do produto  " + pedidos.getProduto());
		
		
		
		
	}
	
	TelaDePedidos.mostrar();	
}
	
}