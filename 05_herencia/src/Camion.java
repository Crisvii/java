
public class Camion extends Vehiculo{
	
	//1. Atributos
	int numRuedas;
	
	//2. Constructores
	public Camion(String matricula, String marca, String modelo, double indiceContaminacion, int numRuedas) {
		super(matricula, marca, modelo, indiceContaminacion);
		this.numRuedas = numRuedas;
	}

	//3.Get y Set
	public int getNumRuedas() {
		return numRuedas;
	}

	public void setNumRuedas(int numRuedas) {
		this.numRuedas = numRuedas;
	}

	//4. toString
	public String toString() {
		return "Camion [numRuedas=" + numRuedas + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
				+ ", indiceContaminacion=" + indiceContaminacion + "]";
	}
	
	
	
	

}
