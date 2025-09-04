package excepciones.usuario;

public class NoHayMasPasajesException extends Exception {
    
    public NoHayMasPasajesException(String nombre, int cantidad) {
        super("No hay más pasajes disponibles para el vuelo " + nombre + ". Cantidad solicitada: " + cantidad);
    }

}
