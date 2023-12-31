

// Classe sem construtor

class Vehicle{
	int passengers; //Número de passageiros
	int fuelcap; // Capacidade de armazenamento de combústivel em galões
	int mpg; // Consumo de combustível em milhas por galão
	
	// Retorna a autonomia
	int range(){
		return mpg * fuelcap;
	}
	
	// Calcula o combustível necessário para cobrir uma determinada distância
	double fuelneeded(int miles) {
		return( double) miles/ mpg;
	}
}

public class VehicleDemo {

	public static void main(String[] args) {
		// Cria um objeto Vehicle chamado minivan
		Vehicle minivan = new Vehicle();
		
		// Cria um objeto Vehicle chamado sportcar
		Vehicle sportcar = new Vehicle();	
		double gallons;
		int dist = 21;
		
		// Atribui valores a campos de minivan
		minivan.passengers = 7;
		minivan.fuelcap = 16;
		minivan.mpg = 21;
		
		// Atribui valores a campos de sportcar
		sportcar.passengers = 2;
		sportcar.fuelcap = 14;
		sportcar.mpg = 12;
		
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
