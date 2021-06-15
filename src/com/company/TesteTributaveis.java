package com.company;

public class TesteTributaveis {
    public static void main(String[] args) {
        ContaCorrente cc = new ContaCorrente(222,333);
        cc.deposita(100.0);
        SeguroDeVida seguroDeVida = new SeguroDeVida();
        CalculadoraImposto calculadoraImposto = new CalculadoraImposto();
        calculadoraImposto.registra(cc);
        calculadoraImposto.registra(seguroDeVida);
        System.out.println(calculadoraImposto.getTotalImposto());
    }
}
