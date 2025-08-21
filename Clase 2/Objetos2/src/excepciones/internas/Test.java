package excepciones.internas;

public class Test {
    public static void main(String[] args) {
        // excepciones de puntero a nulo y formato de numero

        String texto = null;
        String numero = "123a";

        try {
            System.out.println(texto.length());

            int valor = Integer.parseInt(numero);
            System.out.println(valor);

        } catch (NullPointerException e) {
            System.out.println("Se produjo una excepción de puntero a nulo");
        } catch (NumberFormatException e) {
            System.out.println("Se produjo una excepción de formato de número");
        } catch (Exception e) {
            System.out.println("Se produjo una excepción");
        }

        System.out.println("Continua el programa");
    }
}
