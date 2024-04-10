package Ejer4;
public class Profesor
{
    public void ponerNotas(Alumno alumno) {
        alumno.getAsignatura1().setCalificacion(Math.random() * 10);
        alumno.getAsignatura2().setCalificacion(Math.random() * 10);
        alumno.getAsignatura3().setCalificacion(Math.random() * 10);
    }

    public double calcularMedia(Alumno alumno) {
        double calificacion1 = alumno.getAsignatura1().getCalificacion();
        double calificacion2 = alumno.getAsignatura2().getCalificacion();
        double calificacion3 = alumno.getAsignatura3().getCalificacion();

        return (calificacion1 + calificacion2 + calificacion3) / 3.0;
    }
}
