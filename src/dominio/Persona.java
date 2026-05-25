package dominio;

import java.time.LocalDate;

public class Persona {
	private String dni;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	private String genero;
	private String direccion;
	private String telefono;
	private String email;
	public String getDni() {
		return dni;
	}
	public String getNombre() {
		return nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	public String getGenero() {
		return genero;
	}
	public String getDireccion() {
		return direccion;
	}
	public String getTelefono() {
		return telefono;
	}
	public String getEmail() {
		return email;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	@Override
	public String toString() {
	    return "DNI: " + dni + "\n" +
	           "Nombre: " + nombre + "\n" +
	           "Apellido: " + apellido + "\n" +
	           "FechaNacimiento: " + fechaNacimiento + "\n" +
	           "Género: " + genero + "\n" +
	           "Dirección: " + direccion + "\n" +
	           "Teléfono: " + telefono + "\n" +
	           "Email: " + email;
	}

	
	
	
}
