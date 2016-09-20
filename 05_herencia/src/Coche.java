
public class Coche extends Vehiculo{

	//1. Atributos
	boolean cuatroXcuatro;
	
	//2. Constructores
	public Coche(String matricula, String marca, String modelo, double indiceContaminacion, boolean cuatroXcuatro){
		super(modelo, modelo, modelo, indiceContaminacion);
		this.cuatroXcuatro = cuatroXcuatro;
	}
	
	//3. Get y Set
	public boolean isCuatroXcuatro() {
		return cuatroXcuatro;
	}

	public void setCuatroXcuatro(boolean cuatroXcuatro) {
		this.cuatroXcuatro = cuatroXcuatro;
	}
	
	//4. Método toString
	public String toString() {
		return "Coche [cuatroXcuatro = " +isCuatroXcuatro() + ", matricula = " + getMatricula() + ", marca = " + getMarca() + ", modelo = "
				+ getModelo() + ", indiceContaminacion = " + getIndiceContaminacion() + "]";
	}
	
	
}
