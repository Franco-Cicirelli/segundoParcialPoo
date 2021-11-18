package segundoparcial;

public class Main {
   public static void main(String[] args) {
	
	   Profesor p1 = new Profesor(100,"John","Doe");
	   Estudiante e1 = new Estudiante(40671233,"Franco","Cicirelli","Analista");
	   
	   e1.materiasAprobadas.add("Programacion Web 1");
	   e1.materiasAprobadas.add("Introduccion a la programacion");
	   e1.materiasAprobadas.add("Comunicacion visual");
	   e1.materiasInscriptas.add("Programacion orientada a objetos");
	   e1.materiasInscriptas.add("Base de datos I");
	   
	   System.out.println(p1);
	   System.out.println(e1);
	   e1.imprimirMateriasAprobadas(e1.materiasAprobadas);
	   e1.imprimirMateriasInscriptas(e1.materiasInscriptas);
	   
}
}
