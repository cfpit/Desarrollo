package excepciones.runtime;

public class Test {
    public static void main(String[] args) throws Exception {
        // envolve el codigo en try catch para manejar la excepcion
        try {
            // int[] arreglo = new int[3];
            // System.out.println("Antes del error");
            // arreglo[3] = 1; // Esto lanza una excepción de tipo ArrayIndexOutOfBoundsException
            // System.out.println("Después del error"); // Esta línea no se ejecuta

            // excepcion de tipo NullPointerException
            String texto = null;
            System.out.println(texto.length()); // Esto lanza una excepción de tipo NullPointerException

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Ud. está tratando de acceder a un índice que no existe en el arreglo");
            e.printStackTrace();
        } catch (NullPointerException e) {
            System.out.println("Ud. está tratando de acceder a un objeto que no ha sido inicializado");
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Excepción genérica");
            e.printStackTrace();
        }
    }

}
