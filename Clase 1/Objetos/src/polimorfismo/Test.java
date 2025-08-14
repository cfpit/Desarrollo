package polimorfismo;

public class Test {
    public static void main(String[] args) {
        Auto a = new Auto("Fiat", 0);
        AutoCarrera ac = new AutoCarrera("Ferrari", 0, "titanio");

        a.acelerar();//0 --> 10
        ac.acelerar();//0 --> 100

        System.out.println(a);
        System.out.println(ac);

    }
}
