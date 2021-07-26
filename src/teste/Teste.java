package teste;

import com.company.Conta;
import com.company.ContaCorrente;
import com.company.GuardadorDeContas;

// array []
public class Teste {
	public static void main(String[] args) {
		GuardadorDeContas guardador = new GuardadorDeContas();
		ContaCorrente cc = new ContaCorrente(22, 11);
		ContaCorrente cc2 = new ContaCorrente(22, 22);

		guardador.adiciona(cc);
		guardador.adiciona(cc2);
		int tamanho = guardador.GetQuantidadeDeElementos();
		System.out.println(tamanho);
		Conta ref = guardador.getReferencia(0);
		System.out.println(ref.getNumero());
	}
}
