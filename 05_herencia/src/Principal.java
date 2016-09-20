
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vehiculo coche1 = new Coche("2731CNH", "Renault", "Clio", 35.6, false);
		Vehiculo moto1 = new Moto("1234AAA", "Me", "Aburro", 54.6, 125);
		Vehiculo camion1 = new Camion("5622HTF", "Wehe", "Weheins", 69.8, 12);
		
		System.out.println(coche1.toString());
		System.out.println("¿Es contaminante el coche?: "+coche1.esContaminante());

	}

}
