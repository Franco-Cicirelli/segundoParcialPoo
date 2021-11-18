package segundoparcial;

import java.util.ArrayList;

public class Profesor extends Usuario {
	
	

	//Atributos
	private ArrayList<String> comisiones = new ArrayList<>();
	
	//Constructor
	public Profesor(int dni, String nombre, String apellido) {
		super(dni, nombre, apellido);
	}

	public ArrayList<String> getComisiones() {
		return comisiones;
	}

	public void setComisiones(ArrayList<String> comisiones) {
		this.comisiones = comisiones;
	}
	
	public void imprimirComisiones(ArrayList<String> comisiones) {
		System.out.println("Comisiones:\n");
		for (String comi : comisiones) {
			System.out.printf("Comision:%s\n",comi);
		}
	}
	
  /*
   * Cree una tercera clase llamada Profesor que herede de Usuario, y adicional tenga los siguientes
atributos: comisiones (ArrayList<String>). Sugerencia: recuerde inicializar los ArrayList en la
declaraci�n. Defina un constructor que reciba como par�metros todos los atributos de la clase padre.
Cree un m�todo llamado imprimirComisiones, la invocaci�n del m�todo debe mostrar por pantalla
un t�tulo (�Comisiones�) seguido del nombre de cada comisi�n en el ArrayList a imprimir.
   */
}
