package polimorfismo;

public class Auto {
    private String marca;
    protected int velocidad;

    public Auto() {
    }

    public Auto(String marca, int velocidad) {
        this.marca = marca;
        this.velocidad = velocidad;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void acelerar() {
        this.velocidad += 10;
    }

    @Override
    public String toString() {
        return "Auto [marca=" + marca + ", velocidad=" + velocidad + "]";
    }

}
