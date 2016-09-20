
public class Vehiculo {
	
	//1. Atributos
	protected String matricula;
	protected String marca;
	protected String modelo;
	protected double indiceContaminacion;
	
	//2. Contructor
	public Vehiculo(String matricula, String marca, String modelo, double indiceContaminacion){
		this.matricula = matricula;
		this.marca = marca;
		this.modelo = modelo;
		this.indiceContaminacion = indiceContaminacion;
	}

	protected String getMatricula() {
		return matricula;
	}

	protected void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	protected String getMarca() {
		return marca;
	}

	protected void setMarca(String marca) {
		this.marca = marca;
	}

	protected String getModelo() {
		return modelo;
	}

	protected void setModelo(String modelo) {
		this.modelo = modelo;
	}

	protected double getIndiceContaminacion() {
		return indiceContaminacion;
	}

	protected void setIndiceContaminacion(double indiceContaminacion) {
		this.indiceContaminacion = indiceContaminacion;
	}
	
	public boolean esContaminante(){
		boolean resultado = false;
		if(getIndiceContaminacion() > 50) 
			resultado = true;
		return resultado;
	}
	
	

}
