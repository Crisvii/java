package Principal;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		Menu menu = new Menu(' ');
		do{
		menu.menu(' ');
		System.out.print("¿Seguir utilizando la calculadora? (s/n): ");
		}while(teclado.next().charAt(0) == 's' || teclado.next().charAt(0) == 'S');
	}

}
