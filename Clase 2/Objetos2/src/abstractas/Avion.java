package abstractas;

public class Avion extends Vehiculo {
    private String vuelo;

    public Avion(int velocidad, String vuelo) {
        super(velocidad);
        this.vuelo = vuelo;
    }

    public String getVuelo() {
        return vuelo;
    }

    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }

    @Override
    public String toString() {
        return "Avion [vuelo=" + vuelo + super.toString()+ " ]";
    }

    @Override
    public void acelerar() {
        this.velocidad += 100;
    }

    //implemento el metodo abstracto acelerar
    
}
