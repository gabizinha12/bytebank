package com.company;

public class GuardadorDeContas {
	private Conta[] referencias;
    private int PosicaoLivre;
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.PosicaoLivre = 0;

	}

	public void adiciona(Conta ref) {
        this.referencias[this.PosicaoLivre] = ref;
		this.PosicaoLivre++;
	}

	public int GetQuantidadeDeElementos() {
		// TODO Auto-generated method stub
		return this.PosicaoLivre;
	}

	public Conta getReferencia(int pos) {
		// TODO Auto-generated method stub
		return this.referencias[pos];
	}
	
}
