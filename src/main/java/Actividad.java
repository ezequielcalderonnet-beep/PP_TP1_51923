import java.util.ArrayList;
import java.util.List;

public abstract class Actividad {

    //ATRIBUTOS
    protected int id;
    protected String titulo;
    protected int cupoMaximo;
    public static final int CUPO_MINIMO = 5;
    protected List<Inscripcion> inscripciones;

    //CONSTRUCTORES
    public Actividad(int id, String titulo, int cupoMaximo) {
        this.id = id;
        this.titulo = titulo;
        this.cupoMaximo = cupoMaximo;
        this.inscripciones = new ArrayList<>();
    }

    //METODOS
    public void inscribir(Estudiante estudiante) {
        if (inscripciones.size() < cupoMaximo) {
            Inscripcion nuevaInscripcion = new Inscripcion(estudiante);
            inscripciones.add(nuevaInscripcion);
        } else {
            System.out.println("Cupo máximo alcanzado para la actividad: " + titulo);
        }
    }

    public void mostrarInscripciones() {
        System.out.println("Inscriptos en " + titulo + ":");
        for (Inscripcion i : inscripciones) {
            System.out.println("- " + i.getEstudiante().getNombre());
        }
    }

    public final void mostrarIdentificacion() {
        System.out.println("Actividad ID: " + id + " - Título: " + titulo + " (" + getTipo() + ")");
    }

    public abstract double calcularCostoMateriales();
    public abstract String getTipo();
}
