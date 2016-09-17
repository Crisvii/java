package Principal;

import java.util.Scanner;

public class Menu {
	
	//1. Atributos
	char operador;
	
	//2. Constructores
	public Menu(char operador){
		this.operador = operador;
	}

	//3. Get y Set
	public char getOperador() {
		return operador;
	}

	public void setOperador(char operador) {
		this.operador = operador;
	}

	//4. Método toString
	
	//5. Otros métodos
	public void menu(char operador){
		Operacion operacion = new Operacion(0, 0);
		Scanner teclado = new Scanner(System.in);
		System.out.println("Operaciones: +, -, *, /\n");
		System.out.print("Escoger opción: ");
		operador = teclado.next().charAt(0);//Escanear un char
		System.out.print("\n>>> ");
		operacion.setOp1(teclado.nextDouble());
		System.out.println("  "+operador);
		System.out.print(">>> ");
		operacion.setOp2(teclado.nextDouble());
		switch(operador){
		case '+':
			System.out.println("= "+operacion.sumar(operacion.getOp1(), operacion.getOp2()));
			break;
		case '-':
			System.out.println("= "+operacion.restar(operacion.getOp1(), operacion.getOp2()));
			break;
		case '*':
			System.out.println("= "+operacion.multiplicar(operacion.getOp1(), operacion.getOp2()));
			break;
		case '/':
			System.out.println("= "+operacion.dividir(operacion.getOp1(), operacion.getOp2()));
			break;
		default: System.out.println("Error. No se ha escogido una opción existente.\nFin del programa.");
		System.exit(0);
		}
	}
	
	
	
}
