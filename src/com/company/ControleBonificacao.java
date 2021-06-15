package com.company;

public class ControleBonificacao {
    public double getSoma() {
        return soma;
    }

    public void setSoma(double soma) {
        this.soma = soma;
    }

    private double soma;

    public void registro(Funcionario f) {
        double boni = f.getBonificacao();
        this.soma = this.soma + boni;

    }

}
