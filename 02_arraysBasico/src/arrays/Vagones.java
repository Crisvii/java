package arrays;

import java.util.Scanner;

public class Vagones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numVagones = 0;
		
		System.out.println("¿Cuántos vagones tiene el tren?\n\n--> ");
		Scanner teclado = new Scanner(System.in);
		numVagones = teclado.nextInt();
		
		int vagones[] = new int[numVagones];//Creo la variable tan grande como el número introducido.
		
		//Recoger datos
		for(int i = 0; i < numVagones; i ++){
			System.out.println("\nPasajeros del vagón "+(i+1)+": ");
			vagones[i] = teclado.nextInt();
			
		}
		//Imprimir datos
		for(int i = 0; i < numVagones; i ++){
			System.out.println("\nEl vagón "+(i+1)+" tiene "+vagones[i]+" pasajeros.\n");
		}
		
	}

}
