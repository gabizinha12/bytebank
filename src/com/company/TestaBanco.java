package com.company;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente Gabi = new Cliente();
        Gabi.nome = "Gabrielle Lima";
        Gabi.cpf = "088.189.539-31";
        Gabi.profissao = "Programadora";
        System.out.println();
        Conta contaGabi = new Conta();
        contaGabi.deposita(1000);
    }
}
