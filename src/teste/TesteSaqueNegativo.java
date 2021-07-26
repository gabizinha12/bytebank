package teste;

import com.company.Conta;

public class TesteSaqueNegativo {
    public static void main(String[] args) {
        Conta conta = new Conta(500,340);
        conta.deposita(100);
        System.out.println(conta.saca(101));

        conta.saca(101);

        System.out.println(conta.getSaldo());
    }
}