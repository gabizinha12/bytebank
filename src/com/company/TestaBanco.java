package com.company;

public class TestaBanco {
    public static void main(String[] args) {
        Cliente Gabi = new Cliente();
        Gabi.setNome("Gabrielle Lima");
        Gabi.setCpf("088.189.539-31");
        Gabi.setProfissao("Programadora");
        System.out.println();
        Conta contaGabi = new Conta(400,580);
        contaGabi.deposita(1000);
    }
}
