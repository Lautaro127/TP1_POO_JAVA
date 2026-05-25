package dominio;

import java.time.LocalDate;

public class Principal {

	public static void main(String[] args) {
		Empleado empleado1 = new Empleado();
		Empleado empleado2 = new Empleado("12345678A","María","López",LocalDate.of(1990,5,12),"Femenino","Calle Sol 45","555-1234","maria.lopez@email.com","Analista de datos"); 
		Empleado empleado3 = new Empleado("87654321B","Juan","García",LocalDate.of(1985,11,3),"Masculino","Avenida Luna 78","555-5678","juan.garcia@email.com","Desarrollador senior");
		Empleado[] lista = {empleado1,empleado2, empleado3}; 
		
		for (Empleado empleado : lista) {
			System.out.println(empleado.toString());
			System.out.println();
		}
		
		System.out.println();
		
		System.out.print("El siguiente legajo es " + Empleado.proximoLegajo());
	}

}
