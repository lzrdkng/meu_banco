package com.banco;

public class ContaCorrente extends OperacoesConta{
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}

	public void imprimirExtrato() {
		System.out.println(">>>Extrato da conta corrente<<<");
		extrato();
	}


}
