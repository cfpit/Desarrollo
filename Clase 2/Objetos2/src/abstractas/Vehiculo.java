package abstractas;

public abstract class Vehiculo {
    protected int velocidad;

    public Vehiculo() {
    }

    public Vehiculo(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    @Override
    public String toString() {
        return " velocidad=" + velocidad;
    }

    //metodo abstracto
    public abstract void acelerar();
    // public abstract void frenar();



}
