package com.company;

public class TestaContaSemCliente {
    public static void main(String[] args) {
        Conta contaDaMarcela = new Conta();
        System.out.println(contaDaMarcela.getSaldo());

       // contaDaMarcela.titular = new Cliente(); nao acessar atributos diretamente
       // System.out.println(contaDaMarcela.titular);

      // usar getters e setters  contaDaMarcela.titular.nome = "Marcela";
     //   System.out.println(contaDaMarcela.titular.nome);
    }
}