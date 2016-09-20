
public class AlumnoESO extends Alumno{
	
	//1. Atributos
	byte numMateriasRepetidas;

	//2. Constructores
	public AlumnoESO(String DNI, String nombre, String apellidos, byte numAsignaturas, short anioNacimiento,
			byte numMateriasRepetidas) {
		super(DNI, nombre, apellidos, numAsignaturas, anioNacimiento);
		this.numMateriasRepetidas = numMateriasRepetidas;
	}

	//3. Get y Set
	public byte getNumMateriasRepetidas() {
		return numMateriasRepetidas;
	}

	public void setNumMateriasRepetidas(byte numMateriasRepetidas) {
		this.numMateriasRepetidas = numMateriasRepetidas;
	}

	//4. toString
	public String toString() {
		return "AlumnoESO [numMateriasRepetidas=" + numMateriasRepetidas + ", numAsignaturas=" + numAsignaturas
				+ ", anioNacimiento=" + anioNacimiento + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos="
				+ apellidos + "]";
	}
	
	
	
	

}
