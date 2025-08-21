package interfaces;

public class Gerente implements Empleado {

    private int sueldoBase;
    private int antiguedad;

    // constructor vacio
    public Gerente() {
    }

    public Gerente(int sueldoBase, int antiguedad) {
        this.sueldoBase = sueldoBase;
        this.antiguedad = antiguedad;
    }

    // getters y setters
    public int getSueldoBase() {
        return sueldoBase;
    }

    public void setSueldoBase(int sueldoBase) {
        this.sueldoBase = sueldoBase;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    // toString
    

    // Implementación del contrato de la interface Empleado
    @Override
    public void calcularSueldo() {
        System.out.println  (
                "Sueldo Gerente: " + (sueldoBase + (antiguedad * sueldoBase * 0.02))
                            );
    }

    @Override
    public String toString() {
        return "Gerente [sueldoBase=" + sueldoBase + ", antiguedad=" + antiguedad + "]";
    }

}
