import java.util.ArrayList;
import java.util.List;

// Archivo: EventoUniversitario.java
public class EventoUniversitario {

    //ATRIBUTOS
    private final String id;
    private String titulo;
    private double costoBase;
    private boolean gratuito;
    private static int cantidadEventos = 0;
    private Sala sala;
    private List<Actividad> actividades;

    //CONSTRUCTORES
    public EventoUniversitario(String id, String titulo, double costoBase, boolean gratuito) {
        this.id = id;
        this.titulo = titulo;
        this.costoBase = costoBase;
        this.gratuito = gratuito;
        this.actividades = new ArrayList<>();
        cantidadEventos++;
    }

    //CONSTRUCTORES DE COPIA
    public EventoUniversitario(EventoUniversitario otro) {
        this.id = otro.id + "_copia";
        this.titulo = otro.titulo;
        this.costoBase = otro.costoBase;
        this.gratuito = otro.gratuito;
        this.actividades = new ArrayList<>(otro.actividades);
        cantidadEventos++;
    }

    //METODOS
    public void asignarSala(Sala sala) {
        this.sala = sala;
    }

    public void crearActividad(int id, String titulo, int cupo, String tipo) {
        if (tipo.equalsIgnoreCase("Charla")) {
            actividades.add(new Charla(id, titulo, cupo, "Disertante a confirmar"));
        } else if (tipo.equalsIgnoreCase("Taller")) {
            actividades.add(new Taller(id, titulo, cupo, true)); // Por defecto asume que requiere notebook, se puede ajustar
        }
    }

    public List<Actividad> getActividades() {
        return actividades;
    }

    public double calcularCostoEstimado() {
        if (gratuito) {
            return 0.0;
        }

        double costoActividades = 0.0;
        for (Actividad act : actividades) {
            costoActividades += act.calcularCostoMateriales();
        }

        return (costoBase + costoActividades) * 1.21;
    }

    public void mostrarDatos() {
        System.out.println("\n--- Datos del Evento: " + titulo + " ---");
        System.out.println("ID: " + id);
        System.out.println("Sala Asignada: " + (sala != null ? sala.getNombre() : "Sin asignar"));
        System.out.println("Costo Total Estimado: $" + calcularCostoEstimado());
        System.out.println("Actividades del evento:");
        for (Actividad act : actividades) {
            act.mostrarIdentificacion();
        }
    }

    public static int getCantidadEventos() {
        return cantidadEventos;
    }
}
