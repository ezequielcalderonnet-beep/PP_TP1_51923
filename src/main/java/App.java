public class App {
    public static void main(String[] args) {

        Estudiante e1 = new Estudiante("51923", "Calderon Ezequiel");
        Estudiante e2 = new Estudiante("52900", "Gomez Fernando");
        Estudiante e3 = new Estudiante("50620", "Lopez Maria");

        EventoUniversitario evento1 = new EventoUniversitario("2H7", "Curso de POO en Java", 10000.0, false);

        Sala sala1 = new Sala(1, "Auditorio Principal");
        evento1.asignarSala(sala1);

        evento1.crearActividad(101, "Introducción a Java", 50, "Charla");
        evento1.crearActividad(102, "Taller de Python", 20, "Taller");

        Actividad charla = evento1.getActividades().get(0);
        Actividad taller = evento1.getActividades().get(1);

        charla.inscribir(e1);
        charla.inscribir(e2);
        taller.inscribir(e1);
        taller.inscribir(e3);

        System.out.println("=== ESTUDIANTES REGISTRADOS ===");
        e1.mostrarDatos();
        e2.mostrarDatos();
        e3.mostrarDatos();

        System.out.println("\n=== SALA ===");
        sala1.mostrarDatos();

        System.out.println("\n=== EVENTO UNIVERSITARIO ===");
        evento1.mostrarDatos();

        System.out.println("\n=== INSCRIPCIONES POR ACTIVIDAD ===");
        charla.mostrarInscripciones();
        taller.mostrarInscripciones();

        System.out.println("\nTotal de eventos creados en el sistema: " + EventoUniversitario.getCantidadEventos());
    }
}
