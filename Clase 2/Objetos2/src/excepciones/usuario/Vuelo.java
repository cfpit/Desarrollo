package excepciones.usuario;

public class Vuelo {
    private String nombre;
    private int asientos;

    //constructores
    public Vuelo() {}

    public Vuelo(String nombre, int asientos) {
        this.nombre = nombre;
        this.asientos = asientos;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getAsientos() {
        return asientos;
    }

    public void setAsientos(int asientos) {
        this.asientos = asientos;
    }

    //metodo vender
    public void vender(int asientosSolicitados) throws NoHayMasPasajesException {
        if (asientos >= asientosSolicitados) {
            asientos -= asientosSolicitados;
        } else {
            throw new NoHayMasPasajesException(this.nombre, asientosSolicitados);
        }
    }

    //metodos
    @Override
    public String toString() {
        return "Vuelo: " + nombre + ", Asientos disponibles: " + asientos;
    }
}
