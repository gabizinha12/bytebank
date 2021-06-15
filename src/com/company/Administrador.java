package com.company;

public class Administrador extends Funcionario implements  Autenticavel {
    private AutenticacaoUtil util;
public Administrador() {
    this.util = new AutenticacaoUtil();
}
    @Override
    public double getBonificacao() {
        return 0;
    }

    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    public boolean autentica(int senha) {

      boolean auth =  this.util.autentica(senha);
      return auth;
    }

}
