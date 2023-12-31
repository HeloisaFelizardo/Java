

// Classe com construtor parametrizado

class VehCons{
	int passengers; //Número de passageiros
	int fuelcap; // Capacidade de armazenamento de combústivel em galões
	int mpg; // Consumo de combustível em milhas por galão
	
	VehCons(int p, int f, int m){ // Esse é o construtor para VehCons
		passengers = p;
		fuelcap = f;
		mpg = m;
	}
	
	// Retorna a autonomia
	int range(){
		return mpg * fuelcap;
	}
	
	// Calcula o combustível necessário para cobrir uma determinada distância
	double fuelneeded(int miles) {
		return( double) miles/ mpg;
	}
}

public class VehConsDemo {

	public static void main(String[] args) {
		// Constrói veículos completos
		VehCons minivan = new VehCons(7, 16, 21);	
		VehCons sportcar = new VehCons(2, 14, 12);	
		double gallons;
		int dist = 21;
	
		gallons = minivan.fuelneeded(dist);
		
		System.out.println("To go " + dist + " miles minivan needs " + gallons + " gallons of fuel.");
		
		gallons = sportcar.fuelneeded(dist);
		
		System.out.println("To go " + dist + " miles sportcar needs " + gallons + " gallons of fuel.");
	
		System.out.println("Minivan can carry " + minivan.passengers + " with range " + minivan.range() + " Miles.");
				
		System.out.println("Sportcar can carry " + sportcar.passengers + " with range " + sportcar.range() + " Miles.");
		
		if(minivan.range() > sportcar.range()) {
			System.out.println("Minivan has greater range.");
		}
		
	}

}
