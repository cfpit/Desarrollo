package abstractas;

public class Test {
    public static void main(String[] args) throws Exception {
        // Vehiculo miVehiculo = new Vehiculo();

        //creo avion y bici
        Avion miAvion = new Avion(900, "Vuelo 123");
        Bici miBici = new Bici(20, "26 pulgadas");

        miAvion.acelerar();//900 -> 1000
        miBici.acelerar();//20 -> 25

        System.out.println(miAvion);
        System.out.println(miBici);
    }
}
