public class Estudiante {

    //ATRIBUTOS
    private String legajo;
    private String nombre;

    //CONSTRUCTORES
    public Estudiante(String legajo, String nombre) {
        this.legajo = legajo;
        this.nombre = nombre;
    }

    //METODOS
    public String getNombre() {
        return nombre;
    }

    public void mostrarDatos() {
        System.out.println("Legajo: " + legajo + " | Nombre: " + nombre);
    }
}
