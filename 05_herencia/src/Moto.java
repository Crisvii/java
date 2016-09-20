
public class Moto extends Vehiculo{
	
	//1. Atributos
	int cilindrada;
	
	//2. Constructores
	public Moto(String matricula, String marca, String modelo, double indiceContaminacion, int cilindrada) {
		super(matricula, marca, modelo, indiceContaminacion);
		this.cilindrada = cilindrada;
	}

	//3. Get y Set
	public int getCilindrada() {
		return cilindrada;
	}

	public void setCilindrada(int cilindrada) {
		this.cilindrada = cilindrada;
	}

	//4. toString
	public String toString() {
		return "Moto [cilindrada=" + cilindrada + ", matricula=" + matricula + ", marca=" + marca + ", modelo=" + modelo
				+ ", indiceContaminacion=" + indiceContaminacion + "]";
	}
	

}
