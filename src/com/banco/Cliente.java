package com.banco;



public class Cliente{
	public String nome;
	public Integer cpf;



	public Cliente(String nome, Integer cpf) {
		this.nome = nome;
		this.cpf = cpf;

	}

	public String getNome() {
		return nome;
	}

	public Integer getCpf() {
		return cpf;
	}



	@Override
	public String toString() {
		return "Cliente: " +
				"nome= " + nome + '\'' +
				", cpf=" + cpf ;
	}
}
