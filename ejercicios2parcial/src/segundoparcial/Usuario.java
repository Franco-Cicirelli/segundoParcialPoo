package segundoparcial;

public abstract class Usuario {

	//Atributos
	
	private int dni;
	private String nombre;
	private String apellido;
	
	//Constructor
	
	public Usuario(int dni, String nombre, String apellido) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.apellido = apellido;
	}
	
	//Getters and Setters

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	//Metodo toString 
	
	@Override
	public String toString() {
		return "El dni de " + nombre + " " + apellido + " es " + dni ;
	}
	
	
	

}
