package com.company;

public interface Autenticavel {

    void setSenha(int senha);

    boolean autentica(int senha);
}
//interface eh um contrato portanto quem implementa-la deve implementar seus metodos