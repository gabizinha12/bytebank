package com.company;

public abstract class Funcionario {
    private String nome;

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    private int tipo = 0;

    public String getNome() {
        return nome;
    }
    public abstract double getBonificacao();
// nao ha implementacao
    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    private String cpf;

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    protected double salario;

}
