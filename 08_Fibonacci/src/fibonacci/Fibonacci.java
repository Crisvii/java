package fibonacci;

public class Fibonacci {
	
	//1. Atributos
	int cantidadNumeros;
	
	//2. Constructores
	public Fibonacci(int cantidadNumeros){
		this.cantidadNumeros = cantidadNumeros;
	}
	
	//3. Get y Set
	public int getCantidadNumeros(){
		return cantidadNumeros;
	}
	
	public void setCantidadNumeros(int cantidadNumeros){
		this.cantidadNumeros = cantidadNumeros;
	}
	
	//4. toString? --> no necesario
	//5. Otros métodos
	
	public void calcularImprimirSucesion(int cantidadNumeros){
		
		int numeroAnterior = 1;
		int numeroPosterior = 1;
		int buffer = 0;
		int posicion = 1;
		System.out.print(numeroAnterior+", ");
		while(posicion < cantidadNumeros-1){
			System.out.print(numeroPosterior+", ");
			buffer = numeroPosterior;
			numeroPosterior += numeroAnterior;
			numeroAnterior = buffer;
			posicion ++;
			
		}
		System.out.println(numeroPosterior+".");
	}

}
