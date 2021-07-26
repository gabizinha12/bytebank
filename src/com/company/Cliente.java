package com.company;

public class Cliente implements Autenticavel {
    private AutenticacaoUtil util;

    public Cliente() {
    this.util = new AutenticacaoUtil();

    }

    @Override
    public void setSenha(int senha) {
       this.util.setSenha(senha);
    }

    @Override
    public boolean autentica(int senha) {
      boolean auth = this.util.autentica(senha);
      return auth;
    }

	public void setProfissao(String string) {
		
		
	}

	public void setNome(String string) {
		// TODO Auto-generated method stub
		
	}

	public void setCpf(String string) {
		// TODO Auto-generated method stub
		
	}
}
