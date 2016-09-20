
public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona alumnoFP1 = new AlumnoFP("759874567Z", "Cristina", "Vidal Gordo", (byte) 5, (short) 1997, false);
		Persona alumnoESO1 = new AlumnoESO("985531960Q", "Luis Alberto", "Lastres Alcázar", (byte) 6, (short) 1994, (byte) 17);

		Persona profesorFP1 = new ProfesorFP("653200936A", "Luis", "Pérez Castro", 1245.45, false, 15);
		Persona profesorESO1 = new ProfesorESO("443253936M", "Daniel", "Díaz Carrasco", 1446.49, true, "Idiomas");

		System.out.println(alumnoFP1.toString()+"\n");
		System.out.println(alumnoESO1.toString()+"\n");
		System.out.println(profesorFP1.toString()+"\n");
		System.out.println(profesorESO1.toString()+"\n");
	}

}
