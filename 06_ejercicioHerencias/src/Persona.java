
public class Persona {
	
	//1. Atributos
	protected String DNI;
	protected String nombre;
	protected String apellidos;
	
	//2. Constructores
	public Persona(String dNI, String nombre, String apellidos) {
		super();
		DNI = dNI;
		this.nombre = nombre;
		this.apellidos = apellidos;
	}

	//3. Get y Set
	protected String getDNI() {
		return DNI;
	}

	protected void setDNI(String dNI) {
		DNI = dNI;
	}

	protected String getNombre() {
		return nombre;
	}

	protected void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String getApellidos() {
		return apellidos;
	}

	protected void setApellido1(String apellidos) {
		this.apellidos = apellidos;
	}
	
	
	
	
	
	

}
