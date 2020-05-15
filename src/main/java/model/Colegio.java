package model;

public class Colegio {

	private String nombre;
	private String direccion;
	private String email;
	private String contrasena;
	private String personContacto;
	
	public Colegio(String nombre, String direccion, String email, String contrasena, String personContacto) {
		super();
		this.nombre = nombre;
		this.direccion = direccion;
		this.email = email;
		this.contrasena = contrasena;
		this.personContacto = personContacto;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getContrasena() {
		return contrasena;
	}

	public void setContrasena(String contrasena) {
		this.contrasena = contrasena;
	}

	public String getPersonContacto() {
		return personContacto;
	}

	public void setPersonContacto(String personContacto) {
		this.personContacto = personContacto;
	}
}
