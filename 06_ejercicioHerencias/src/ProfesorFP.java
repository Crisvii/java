
public class ProfesorFP extends Profesor{

	//1. Atributos
	int numVisitas;

	//2. Constructor
	public ProfesorFP(String dNI, String nombre, String apellidos, double salario, boolean esTutor, int numVisitas) {
		super(dNI, nombre, apellidos, salario, esTutor);
		this.numVisitas = numVisitas;
	}

	//3. Get y Set
	public int getNumVisitas() {
		return numVisitas;
	}

	public void setNumVisitas(int numVisitas) {
		this.numVisitas = numVisitas;
	}

	//4. toString
	public String toString() {
		return "ProfesorFP [numVisitas=" + numVisitas + ", salario=" + salario + ", esTutor=" + esTutor + ", DNI=" + DNI
				+ ", nombre=" + nombre + ", apellidos=" + apellidos + "]";
	}
	
	
	
	
}
