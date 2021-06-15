package com.company;

public class TestaGerente {
    public static void main(String[] args) {
        Gerente g1 = new Gerente();
        g1.setNome("Gabi");
        g1.setCpf("123455666");
        g1.setSalario(50000);
        System.out.println(g1.getNome());
        System.out.println(g1.getCpf());
        System.out.println(g1.getSalario());

    }
}
