package excepciones.usuario;

public class Test {
    public static void main(String[] args) {
        //creo un vuelo
        Vuelo vuelo = new Vuelo("Vuelo 123", 100);

        //vendo algunos pasajes
        try {
            vuelo.venderPasajes(50);
            vuelo.venderPasajes(20);
            vuelo.venderPasajes(20);
            vuelo.venderPasajes(30);//esto lanza la excepcion
            vuelo.venderPasajes(5);
            System.out.println("Pasajes vendidos con éxito");
        } catch (NoHayMasPasajesException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Medidas correctivas tomadas");
        }

        //muestro el vuelo
        System.out.println(vuelo);

        
    }
}
