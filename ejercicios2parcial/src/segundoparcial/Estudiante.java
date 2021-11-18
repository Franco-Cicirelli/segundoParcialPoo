package segundoparcial;

import java.util.ArrayList;

public class Estudiante extends Usuario {
	
	//Atributos
	
	private String carrera;
	public ArrayList<String> materiasAprobadas = new ArrayList<>();
	public ArrayList<String> materiasInscriptas = new ArrayList<>();
	
	
	public Estudiante(int dni, String nombre, String apellido, String carrera) {
		super(dni, nombre, apellido);
		this.carrera = carrera;
	}


	public String getCarrera() {
		return carrera;
	}


	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	
	public void imprimirMateriasAprobadas (ArrayList<String> materiasApro) {
		System.out.println("\n***Materias Aprobadas***\n");
		for (String materias : materiasApro) {
			System.out.printf("materia:%s\n",materias);
		}
	}
	
	public void imprimirMateriasInscriptas (ArrayList<String> materiasIns) {
		System.out.println("\n***Materias Inscriptas***\n");
		for (String materias : materiasIns) {
			System.out.printf("materia:%s\n",materias);
		}
	}
	
	
	
	
	/*
	 * Cree una segunda clase llamada Estudiante que herede de Usuario, y adicional tenga los siguientes
atributos: carrera (String), materiasAprobadas (ArrayList<String>) y materiasInscriptas
(ArrayList<String>). Sugerencia: recuerde inicializar los ArrayList en la declaración. Defina un
constructor que reciba como parámetros todos los atributos de la clase padre y el atributo carrera.
Agregue un getter y setter para el atributo carrera. Cree dos métodos, uno llamado
imprimirMateriasAprobadas y otro llamado imprimirMateriasInscriptas, en ambos casos la
invocación del método debe mostrar por pantalla un título (“Materias Aprobadas” o “Materias
Inscriptas”) seguido del nombre de cada materia en el ArrayList a imprimir.
	 */

}
