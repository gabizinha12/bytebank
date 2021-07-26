package teste;

import com.company.Cliente;
import com.company.ContaCorrente;
import com.company.ContaPoupanca;

public class TestArrayReferencias {
	
	public static void main(String[] args) {
		
		//int[] idades = new int[5];
		Object[] referencias = new Object[5];
		
		ContaCorrente cc1 = new ContaCorrente(22, 11);
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		referencias[1] = cc2;	
		
		Cliente cliente = new Cliente();
		referencias[2] = cliente;
		
		//System.out.println(cc2.getNumero());
		
//		Object referenciaGenerica = contas[1];
//		
//		System.out.println( referenciaGenerica.getNumero()  );
		
		ContaPoupanca ref = (ContaPoupanca) referencias[1];//type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
	}

}
