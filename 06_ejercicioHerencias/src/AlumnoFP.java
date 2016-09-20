
public class AlumnoFP extends Alumno{
	
	//1. Atributos
	boolean esDelegado;

	//2. Constructores
	public AlumnoFP(String DNI, String nombre, String apellidos, byte numAsignaturas, short anioNacimiento,
			boolean esDelegado) {
		super(DNI, nombre, apellidos, numAsignaturas, anioNacimiento);
		this.esDelegado = esDelegado;
	}

	//3. Get y Set
	public boolean isEsDelegado() {
		return esDelegado;
	}

	public void setEsDelegado(boolean esDelegado) {
		this.esDelegado = esDelegado;
	}

	//4. toString
	public String toString() {
		return "AlumnoFP [esDelegado=" + esDelegado + ", numAsignaturas=" + numAsignaturas + ", anioNacimiento="
				+ anioNacimiento + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	//5. Otros métodos
	

	
	
}
