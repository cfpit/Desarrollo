package interfaces;

public class Test {
    public static void main(String[] args) {
        Empleado gerente = new Gerente(50000, 5);
        Empleado administrativo = new Administrativo(40, 200);

        gerente.calcularSueldo();
        administrativo.calcularSueldo();
    }
}
