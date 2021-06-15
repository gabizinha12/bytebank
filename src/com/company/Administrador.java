package com.company;

public class Administrador extends FuncionarioAutenticavel {
    private int senha;

    @Override
    public double getBonificacao() {
        return 0;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public boolean autentica(int senha) {

        return this.senha == senha;
    }

}
