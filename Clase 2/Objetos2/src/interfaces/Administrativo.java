package interfaces;

public class Administrativo implements Empleado {
    private int horasTrabajadas;
    private int valorPorHora;

    public Administrativo(int horasTrabajadas, int valorPorHora) {
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
    }

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public int getValorPorHora() {
        return valorPorHora;
    }

    public void setValorPorHora(int valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    @Override
    public String toString() {
        return "Administrativo [horasTrabajadas=" + horasTrabajadas + ", valorPorHora=" + valorPorHora + "]";
    }


    // Implementación del contrato de la interface Empleado
    @Override
    public void calcularSueldo() {
        System.out.println("Sueldo Administrativo: " + (horasTrabajadas * valorPorHora));
    }

}
