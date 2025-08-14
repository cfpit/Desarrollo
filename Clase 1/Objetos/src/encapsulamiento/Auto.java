package encapsulamiento;

public class Auto {
    private String marca;
    private int velocidad;

    public Auto() {}

    public Auto(String marca, int velocidad) {
        this.setMarca(marca);
        this.setVelocidad(velocidad);
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
        //regla de negocio
        if (velocidad >= 0 && velocidad <= 130) {
            this.velocidad = velocidad;
        } else {
            System.out.println("La velocidad es incorrecta");
        }
    }

    //metodos
    public void acelerar() {
        this.setVelocidad(velocidad + 10);
    }
    
    public void acelerar(int km) {
        this.setVelocidad(km + this.velocidad);
    }

    @Override
    public String toString() {
        return "marca=" + marca + ", velocidad=" + velocidad;
    }
}
