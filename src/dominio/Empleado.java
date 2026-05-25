package dominio;

public class Empleado extends Persona{
	private static int legajoContador = 999;
	private final int legajo;
	private String puesto;
	
	public Empleado() {
		legajoContador++;
		legajo = legajoContador;
		puesto = "Sin nombre de puesto";
	}
	
	@Override
	public String toString() {
	    return "Legajo: " + legajo + "\n" +
	           "Puesto: " + puesto;
	}

	
	
	
}
