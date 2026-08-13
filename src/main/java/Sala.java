public class Sala {

    //ATRIBUTOS
    private int id;
    private String nombre;

    //CONSTRUCTORES
    public Sala(int id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    //METODOS
    public String getNombre() {
        return nombre;
    }

    public void mostrarDatos() {
        System.out.println("ID Sala: " + id + " | Nombre: " + nombre);
    }
}
