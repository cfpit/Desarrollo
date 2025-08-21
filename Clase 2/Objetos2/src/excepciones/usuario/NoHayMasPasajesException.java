package excepciones.usuario;

public class NoHayMasPasajesException extends Exception {

    private String vuelo;
    private int asientosPedidos;

    public NoHayMasPasajesException(String vuelo, int asientosPedidos) {
        this.vuelo = vuelo;
        this.asientosPedidos = asientosPedidos;
    }

    public String getVuelo() {
        return vuelo;
    }

    public int getAsientosPedidos() {
        return asientosPedidos;
    }

    //mensaje de error
    @Override
    public String getMessage() {
        return "No hay más pasajes disponibles para el vuelo: " + vuelo + 
        ". \nAsientos solicitados: " + asientosPedidos;
    }

}
