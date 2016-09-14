package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	int mes = 0;	
		
	System.out.println("Número de mes: ");
	Scanner teclado = new Scanner(System.in);
	
	mes = teclado.nextInt();
	
	/*if(mes < 1 && mes > 12){
		System.out.println("NO EXISTE ESE MES !!!");
		System.exit(0);
	}*/
	
	switch(mes){
	case 1:
		System.out.println("\nEl mes "+mes+" es Enero.");
		break;
	case 2:
		System.out.println("\nEl mes "+mes+" es Febrero.");
		break;
	case 3:
		System.out.println("\nEl mes "+mes+" es Marzo.");
		break;
	case 4:
		System.out.println("\nEl mes "+mes+" es Abril.");
		break;
	case 5:
		System.out.println("\nEl mes "+mes+" es Mayo.");
		break;
	case 6:
		System.out.println("\nEl mes "+mes+" es Junio.");
		break;
	case 7:
		System.out.println("\nEl mes "+mes+" es Julio.");
		break;
	case 8:
		System.out.println("\nEl mes "+mes+" es Agosto.");
		break;
	case 9:
		System.out.println("\nEl mes "+mes+" es Septiembre.");
		break;
	case 10:
		System.out.println("\nEl mes "+mes+" es Octubre.");
		break;
	case 11:
		System.out.println("\nEl mes "+mes+" es Noviembre.");
		break;
	case 12:
		System.out.println("\nEl mes "+mes+" es Diciembre.");
		break;
        default:
                System.out.println("\n¡ El mes "+mes+" no existe !");
		
	}
	
	System.out.println("Repetimos, con los meses siguientes...\nNúmero de mes: ");
	mes = teclado.nextInt();
	
	switch(mes){
	case 1:
		System.out.println("\nEnero.");

	case 2:
		System.out.println("\nFebrero.");

	case 3:
		System.out.println("\nMarzo.");

	case 4:
		System.out.println("\nAbril.");

	case 5:
		System.out.println("\nMayo.");

	case 6:
		System.out.println("\nJunio.");

	case 7:
		System.out.println("\nJulio.");

	case 8:
		System.out.println("\nAgosto.");

	case 9:
		System.out.println("\nSeptiembre.");

	case 10:
		System.out.println("\nOctubre.");

	case 11:
		System.out.println("\nNoviembre.");

	case 12:
		System.out.println("\nDiciembre.");
        default:
                System.out.println("\n¡ El mes "+mes+" no existe !");


	}


	
}
}
