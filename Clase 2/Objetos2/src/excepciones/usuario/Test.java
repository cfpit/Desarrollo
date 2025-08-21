package excepciones.usuario;

public class Test {
    public static void main(String[] args) {
        Vuelo vuelo1 = new Vuelo("ABC-123",100);

        try {
            vuelo1.vender(50); // Vende 50 asientos
            System.out.println(vuelo1); // Imprime el estado del vuelo

            vuelo1.vender(60); // Intenta vender 60 asientos, lo que debería lanzar una excepción
        } catch (NoHayMasPasajesException e) {
            System.out.println(e.getMessage());
        }
    }
}
