package com.company;

public class Gerente  extends FuncionarioAutenticavel{
    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    private int senha;
    public double getBonificacao() {
        return this.getBonificacao() + super.salario;
  }
    public boolean autentica(int senha) {
        return this.senha == senha;
    }


}
