package com.banco;


import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Cliente> clientes = new ArrayList<Cliente>();{{
			clientes.add(new Cliente("Robson",123456349));
			clientes.add(new Cliente("Armando",256477388));
			clientes.add(new Cliente("Roberto",212323212));
		}}
		ContaPoupança novaConta2 = new ContaPoupança(clientes.get(2));
		novaConta2.deposito(100.00);
		novaConta2.rendimentoMensal();
		System.out.println(clientes.toString());

	}
}
