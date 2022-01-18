package main;

public class Main {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente("Venilton");
		Conta cc = new ContaCorrente(cliente1);
		cc.depositar(100.40);
		Conta poupanca = new ContaPoupanca(cliente1);
		Cliente cliente2 = new Cliente("André");
		Conta cc2 = new ContaCorrente(cliente2);
		cc.transferir(50, poupanca);
		cc.imprimirExtrato();
		cc2.imprimirExtrato();
		poupanca.imprimirExtrato();
		Banco banco = new Banco();
		banco.adicionaClientes(cliente1);
		banco.adicionaClientes(cliente2);
		banco.imprimeClientes();
	}

}
