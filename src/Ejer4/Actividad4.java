package Ejer4;

public class Actividad4
{
    // Metodo Main para inicializar Asignaturas
    public static void main(String[] args)
    {
        Asignatura asignatura1 = new Asignatura(1);
        Asignatura asignatura2 = new Asignatura(2);
        Asignatura asignatura3 = new Asignatura(3);

        // Creacion de Alumno con las asignaturas
        Alumno alumno = new Alumno(asignatura1, asignatura2, asignatura3);

        // Creacion de Profesor
        Profesor profesor = new Profesor();

        // Para poner las calificaciones
        profesor.ponerNotas(alumno);    

        // Hacer media
        double media = profesor.calcularMedia(alumno);
        System.out.println("La media del alumno es: " + media);
    }
}
