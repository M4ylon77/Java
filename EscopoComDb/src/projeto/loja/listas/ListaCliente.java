package projeto.loja.listas;

import java.util.ArrayList;
import java.util.List;

import projeto.loja.modulos.Cliente;

public class ListaCliente {
private List<Cliente> clientes = new ArrayList<Cliente>();
	
	public void adicionar (Cliente clientes) {
		this.clientes.add(clientes);
		
	}
	
	public void remover(Cliente clientes) {
		this.clientes.remove(clientes);
		
	}
	
	public List<Cliente> getCliente () {
		return clientes;
		
	}
	
}
