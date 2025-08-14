package encapsulamiento;
public class Test {
    public static void main(String[] args) throws Exception {
        //creo el objeto
        Auto a = new Auto();
        Auto b = new Auto("Ford", 140);

        //estado inicial
        a.setMarca("Toyota");
        a.setVelocidad(0);

        //comportamiento
        a.acelerar();//0 --> 10
        a.acelerar(150);//10 --> ????

        b.acelerar(20);//0 --> 20

        //estado final
        System.out.println(a.toString());
        System.out.println(b);
    }
}
