package com.company;

public class Conta {
   private double saldo;
   private int agencia;
   private int numero;
   private static int total;
   private Cliente titular;

   public Conta(int agencia, int numero) {
       total++;
       System.out.println("O total de contas é " + Conta.total);
       this.agencia = agencia;
       this.numero = numero;
   }


  public  void deposita(double valor) {
        this.saldo = this.saldo  + valor;

    }
    public static int getTotal() {
       return Conta.total;
    }
    public boolean saca(double valor) {
        if(this.saldo >= valor) {
            this.saldo = this.saldo - valor;
            return true;
        } else {
            return false;
        }
    }
    public boolean transfere(double valor, Conta conta) {
        if(this.saldo >= valor) {
            this.saldo -= valor;
            conta.deposita(valor);
            return true;
        } else {
            return false;
        }
    }
    public double getSaldo() {
    return this.saldo;
    }
    public int getNumero() {
        return this.numero;
    }
    public void setNumero(int numero) {
       if(numero <= 0) {
           System.out.println("Numero invalido");
           return;
       }
      this.numero = numero;
    }
    public void setTitular(Cliente titular) {
        this.titular = titular;
    }
    public Cliente getTitular() {
        return this.titular;
    }
    public int getAgencia() {
        return this.agencia;
    }
    public void setAgencia(int agencia) {
        if(agencia <= 0) {
            System.out.println("Agencia invalida");
            return;
        }
      this.agencia = agencia;
    }
}
