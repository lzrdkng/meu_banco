package com.banco;



public abstract class OperacoesConta {
    private  static final int  AG = 1;
    private static int SEQUENTIAL= 0;
    protected int numero;
    protected int agencia;
    protected double saldo;

    protected Cliente cliente;


    public OperacoesConta(Cliente cliente){
        this.agencia = OperacoesConta.AG;
        this.numero = SEQUENTIAL++;
        this.cliente = cliente;
    }


    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }


    public void sacar(double valor){
        if (saldo > 0d) {
            saldo -= valor;
            System.out.println("Voce sacou: "+valor);
        }else{
            System.out.println("Saldo insuficeinte");
        }
    }


    public void deposito(double valor){
        if (valor > 0d) {
            saldo += valor;
            System.out.println("Voce depositou: "+valor+"e agora tem: "+saldo );
        }else{
            System.out.println("Impossivel fazer transaçao, é necessário uma quantia maior que zero");
        }
    }

    public void transferencia(double valor, OperacoesConta contaDestinataria){
        if (saldo > 0d) {
            this.sacar(valor);
            contaDestinataria.deposito(valor);
        }else{
            System.out.println("Saldo insuficiente");
        }
   }
    
    protected void extrato() {
    	System.out.println(String.format("Agencia: ", "%d") + this.agencia);
    	System.out.println(String.format("Titular: ", "%s") + this.cliente.getNome());
    	System.out.println(String.format("Numero: ", "%d") + this.numero);
    	System.out.println(String.format("Saldo: ", "%.2f") + this.saldo);
    	
    }
    
}
