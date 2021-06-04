package com.company;

public class Conta {
   private double saldo;
   private int agencia;
   private int numero;
   private Cliente titular;
  public  void deposita(double valor) {
        this.saldo = this.saldo  + valor;

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
        this.agencia = agencia;
    }
}
