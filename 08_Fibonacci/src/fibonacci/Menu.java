package fibonacci;

import java.util.Scanner;

public class Menu {

	Fibonacci fibonacci = new Fibonacci(0);
	
	public void ejecutarMenu(){
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("SUCESIÓN DE FIBONACCI\n");
		System.out.println("¿Sucesión de cuantos números?");
		System.out.print("--> ");
		fibonacci.calcularImprimirSucesion(teclado.nextInt());
	}
}
