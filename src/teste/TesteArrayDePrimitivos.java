package teste;

public class TesteArrayDePrimitivos {

	//Array []
	public static void main(String[] args) {
		
		int[] idades = new int[5];//inicializa o array com 0
		
		for(int i = 0; i < idades.length; i++) {
			idades[i] = i * i;
		}
		
		for(int i = 0; i < idades.length; i++) {
			System.out.println(idades[i]);
		}

	}

}
