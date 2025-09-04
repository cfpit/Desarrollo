package excepciones.usuario;

public class Vuelo {
    private String nombre;
    private int pasajesDisponibles;

    public Vuelo(String nombre, int pasajesDisponibles) {
        this.nombre = nombre;
        this.pasajesDisponibles = pasajesDisponibles;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPasajesDisponibles() {
        return pasajesDisponibles;
    }

    //setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPasajesDisponibles(int pasajesDisponibles) {
        this.pasajesDisponibles = pasajesDisponibles;
    }

    public void venderPasajes(int cantidad) throws NoHayMasPasajesException {
        if (cantidad > pasajesDisponibles) {
            throw new NoHayMasPasajesException(nombre, cantidad);
        }
        pasajesDisponibles -= cantidad;
    }

    //toString
    @Override
    public String toString() {
        return "Vuelo{" +
                "nombre='" + nombre + '\'' +
                ", pasajesDisponibles=" + pasajesDisponibles +
                '}';
    }
}
