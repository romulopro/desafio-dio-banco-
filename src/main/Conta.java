package main;

import lombok.Getter;
import lombok.NonNull;

public abstract class Conta implements IConta{
	
	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 0;
	@Getter
	protected int agencia;
	@Getter
	protected int numero;
	@Getter
	protected double saldo;
	@Getter
	@NonNull
	protected Cliente cliente;
	
	
	public Conta(Cliente cliente) {
		this.agencia = AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.saldo = 0.00;
		this.cliente = cliente;
	}


	@Override
	public void sacar(double valor) {
		saldo -= valor;
	}


	@Override
	public void depositar(double valor) {
		saldo += valor;		
	}


	@Override
	public void transferir(double valor, Conta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	protected void imprimirInfosComuns() {
		System.out.println("Titular: " + this.cliente.getNome());
		System.out.println(String.format("Agencia: %d", this.agencia));
		System.out.println(String.format("Número: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
