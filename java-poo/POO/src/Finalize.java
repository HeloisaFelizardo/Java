

class FDemo{
	int x;
	FDemo(int i){
		x = i;
	}
    // Chamada quando o objeto é reciclado
	protected void finalize() {
		System.out.println("Finalizing " + x );
	}
	
	// Gera um objeto que é imediatamente destruido
	void generator(int i) {
		//FDemo objeto = new FDemo(i);
	}
}

public class Finalize {

	public static void main(String[] args) {
		int count;
		
		FDemo ob = new FDemo(0);
		
		/* Agora, gere um grande número de objetos.
		 * Em algum momento, a coleta de lixo ocorrerá.
		 * Nota: você pode ter de aumentar o número 
		 * de objetors gerados para forçar a 
		 * coleta de lixo.
		 */
		
		for(count = 1; count < 1000000; count++){
			ob.generator(count);
		}

	}
}


