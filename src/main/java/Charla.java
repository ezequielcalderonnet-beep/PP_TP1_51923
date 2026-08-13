public class Charla extends Actividad {

    //ATRIBUTOS
    private String disertante;

    //CONSTRUCTORES
    public Charla(int id, String titulo, int cupoMaximo, String disertante) {
        super(id, titulo, cupoMaximo);
        this.disertante = disertante;
    }

    //METODOS
    @Override
    public double calcularCostoMateriales() {
        return 0; // Las charlas son gratuitas según el enunciado
    }

    @Override
    public String getTipo() {
        return "Charla";
    }
}
