package polimorfismo;

public class AutoCarrera extends Auto {
    private String tipoAleron;

    public AutoCarrera() {
    }

    public AutoCarrera(String marca, int velocidad, String tipoAleron) {
        super(marca, velocidad);
        this.tipoAleron = tipoAleron;
    }

    public String getTipoAleron() {
        return tipoAleron;
    }

    public void setTipoAleron(String tipoAleron) {
        this.tipoAleron = tipoAleron;
    }

    @Override
    public String toString() {
        return super.toString() + " tipoAleron=" + tipoAleron;
    }

    @Override
    public void acelerar() {
        this.velocidad += 100;
    }

}
