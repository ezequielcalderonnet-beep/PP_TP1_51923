import java.time.LocalDate;

public class Inscripcion {

    //ATRIBUTOS
    private LocalDate fecha;
    private String estado;
    private Estudiante estudiante;

    //CONSTRUCTORES
    public Inscripcion(Estudiante estudiante) {
        this.fecha = LocalDate.now();
        this.estado = "Confirmada";
        this.estudiante = estudiante;
    }

    //METODOS
    public Estudiante getEstudiante() {
        return estudiante;
    }
}