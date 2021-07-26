package teste.util;

import java.util.ArrayList;

import com.company.Conta;
import com.company.ContaCorrente;

public class TesteArrayListEquals {
	public static void main(String[] args) {

		  ArrayList<Conta> lista = new ArrayList<Conta>(); // o menor e o maior infere o tipo da lista

	        Conta cc = new ContaCorrente(22, 11);
	        lista.add(cc);

	        Conta cc2 = new ContaCorrente(22, 22);
	        lista.add(cc2);
            
	        
	        Conta cc3 = new ContaCorrente(22, 22);
	        lista.add(cc3);        
	        boolean existe = lista.contains(cc3);
	        System.out.println("Já existe? " + existe);
	        for(Conta conta : lista) {
	        	if(conta == cc3) {
	        		System.out.println("Ja tenho essa conta!");
	        	}
	        }
	        System.out.println("Tamanho: " + lista.size());

	        Conta ref = (Conta) lista.get(0);
	        System.out.println(ref.getNumero());

	        
			/*
			 * for(Object oRef : lista) { System.out.println(oRef); }
			 */
for(Conta conta : lista) {
	System.out.println(conta);
}
	    }
	}


