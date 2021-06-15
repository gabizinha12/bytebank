package com.company;

public class ContaCorrente  extends  Conta{
    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override //anotacao de sobrescrita de metodo
    public boolean saca(double valor) {
        double valorASacar = valor + 0.2;
        return super.saca(valorASacar);
    }
}
