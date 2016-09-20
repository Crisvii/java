
public class Alumno extends Persona{

	//1. Atributos
	protected byte numAsignaturas;
	protected short anioNacimiento;
	
	//2. Constructor
	public Alumno(String DNI, String nombre, String apellidos, byte numAsignaturas, short anioNacimiento){
		super(DNI, nombre, apellidos);
		this.numAsignaturas = numAsignaturas;
		this.anioNacimiento = anioNacimiento;
	}

	//3. Get y Set
	protected byte getNumAsignaturas() {
		return numAsignaturas;
	}

	protected void setNumAsignaturas(byte numAsignaturas) {
		this.numAsignaturas = numAsignaturas;
	}
	
	protected short getAnioNacimiento(){
		return anioNacimiento;
	}
	
	protected void setAnioNacimiento(short anioNacimiento){
		this.anioNacimiento = anioNacimiento;
	}

	//4. toString
	
	//5. Otros métodos
	
	
	
	
}
