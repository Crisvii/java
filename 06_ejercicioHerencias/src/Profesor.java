
public class Profesor extends Persona{
	
	//1. Atributos
	protected double salario;
	protected boolean esTutor;
	
	//2. Constructores
	public Profesor(String dNI, String nombre, String apellidos, double salario, boolean esTutor) {
		super(dNI, nombre, apellidos);
		this.salario = salario;
		this.esTutor = esTutor;
	}

	//3. Get y Set
	protected double getSalario() {
		return salario;
	}

	protected void setSalario(double salario) {
		this.salario = salario;
	}
	
	protected boolean isEsTutor(){
		return esTutor;
	}
	
	protected void setEsTutor(boolean esTutor){
		this.esTutor = esTutor;
	}

	//4. toString
	public String toString() {
		return "Profesor [es tutor="+ esTutor+ "salario=" + salario + ", DNI=" + DNI + ", nombre=" + nombre + ", apellidos=" + apellidos
				+ "]";
	}
	
	//5. Otros métodos
	
	
	
	
	

}
