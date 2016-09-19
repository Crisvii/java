package Principal;

import java.util.Scanner;

public class Persona {
	
	//1. Atributos
	String nombre;
	String apellido1;
	String apellido2;
	int dia;
	int mes;
	int anio;
	
	//2. Constructores
	public Persona(String nombre, String apellido1, String apellido2, int dia, int mes, int anio){
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dia = dia;
		this.mes = mes;
		this.anio = anio;
	}

	//3. Get y Set
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public int getDia() {
		return dia;
	}

	public void setDia(int i) {
		this.dia = i;
	}

	public int getMes() {
		return mes;
	}

	public void setMes(int mes) {
		this.mes = mes;
	}

	public int getAnio() {
		return anio;
	}

	public void setAnio(int anio) {
		this.anio = anio;
	}
	
	//4. Método toString
	public String toString(){
		return "Iniciales: "+getNombre().charAt(0)+getApellido1().charAt(0)+getApellido2().charAt(0)+"\nNombre completo: "+getNombre()+" "+getApellido1()+" "+getApellido2()+".\nFecha de nacimiento: "+getDia()+" / "+getMes()+" / "+getAnio()+"\n";
	}
	
	//5. Otros métodos
	public void pedirDatos(String nombre, String apellido1, String apellido2, int dia, int mes, int anio){
		Scanner respuesta = new Scanner(System.in);
		System.out.println("NOMBRE COMPLETO\n");
		System.out.print("\tNombre: ");
		setNombre(respuesta.next());
		System.out.print("\tPrimer apellido: ");
		setApellido1(respuesta.next());
		System.out.print("\tSegundo apellido: ");
		setApellido2(respuesta.next());
		System.out.println("\nFECHA DE NACIMIENTO\n");
		System.out.print("Día: ");
		setDia(respuesta.nextInt());
		System.out.print("Mes: ");
		setMes(respuesta.nextInt());
		System.out.print("Año: ");
		setAnio(respuesta.nextInt());
		System.out.println("\n\n");
	}
	
	public void imprimirDatos(String nombre, String apellido1, String apellido2, int dia, int mes, int anio){
		System.out.println(toString());
	}
	

}
