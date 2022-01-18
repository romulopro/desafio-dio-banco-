package main;
import java.util.LinkedList;

import lombok.Getter;
import lombok.Setter;


public class Banco {
	@Getter
	@Setter
	private String nome;
	private LinkedList<Cliente> clientes = new LinkedList<>();

	public void adicionaClientes(Cliente cliente){
		clientes.addLast(cliente);
	}
	public void imprimeClientes() {
		System.out.println("***Lista de Clientes***");
		for(Cliente cliente :clientes) {
			System.out.println(cliente.getNome());
		}
	}
}
