
public class ProfesorESO extends Profesor{
	
	//1. Atributos
	String departamento;

	//2. Constructores
	public ProfesorESO(String dNI, String nombre, String apellidos, double salario, boolean esTutor, String departamento) {
		super(dNI, nombre, apellidos, salario, esTutor);
		this.departamento = departamento;
	}

	//3. Get y Set
	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	//4. toString
	public String toString() {
		return "ProfesorESO [departamento=" + departamento + "]";
	}
	
	
	
	

}
