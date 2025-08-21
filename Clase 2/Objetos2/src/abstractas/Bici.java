package abstractas;

public class Bici extends Vehiculo {
    private String rodado;

    public Bici() {
    }

    public Bici(int velocidad, String rodado) {
        super(velocidad);
        this.rodado = rodado;
    }

    public String getRodado() {
        return rodado;
    }

    public void setRodado(String rodado) {
        this.rodado = rodado;
    }

    @Override
    public String toString() {
        return "Bici [rodado=" + rodado + super.toString() + " ]";
    }

    @Override
    public void acelerar() {
        this.velocidad += 5;
    }

}
