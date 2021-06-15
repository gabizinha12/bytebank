package com.company;
// nao eh possivel usar herança para tudo, nao eh possivel herança multipla
public class Gerente  extends Funcionario implements Autenticavel {
    private AutenticacaoUtil util;
    public Gerente() {
        this.util = new AutenticacaoUtil();
    }
    public double getBonificacao() {
        return this.getBonificacao() + super.salario;
  }

    @Override
    public void setSenha(int senha) {
        this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
    boolean auth =   this.util.autentica(senha);
    return auth;
    }
}
