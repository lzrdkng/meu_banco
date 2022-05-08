package com.banco;

public class ContaPoupança extends OperacoesConta{
	private  static final double  rendimento = 8.0;

	public ContaPoupança(Cliente cliente) {
		super(cliente);
		double rendimento = this.rendimento;
	}

	public void imprimirExtrato() {
		System.out.println(">>>Extrato da conta poupanca<<<");
		extrato();
	}
	public void rendimentoMensal(){
		double rendMensal = getSaldo() * (rendimento/100);
		System.out.println("Seu rendimento mensal é de : "+ rendMensal + "%  ao mes");
	}
}