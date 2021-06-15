package com.company;

public class SistemaInterno {
    private int senha = 222;
    public void autentica(FuncionarioAutenticavel fa) {
        boolean autenticou = fa.autentica(this.senha);
        if(autenticou) {
            System.out.println("Pode entrar no sistema");
        } else {
            System.out.println("Não pode entrar");
        }

    }
}
