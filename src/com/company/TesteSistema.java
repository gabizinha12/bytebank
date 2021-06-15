package com.company;

public class TesteSistema {
    public static void main(String[] args) {
        Gerente g = new Gerente();
        g.setSenha(222);
        SistemaInterno si = new SistemaInterno();
        si.autentica(g);
    }
}
// classes abstratas ajudam na reutilizacao de codigo, herança e polimorfismo tbm