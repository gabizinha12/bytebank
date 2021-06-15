package com.company;

public class SistemaInterno {
    private int senha;
    public void autentica(Gerente g) {
        g.autentica(this.senha);

    }
}
