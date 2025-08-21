package colecciones.listas;

import java.util.ArrayList;
import java.util.Iterator;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> nombres = new ArrayList<>();
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Persona> personas = new ArrayList<>();

        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Ana");
        nombres.add("Pedro");

        numeros.add(10);
        numeros.add(20);
        numeros.add(30);
        numeros.add(40);

        personas.add(new Persona("Juan", 30));
        personas.add(new Persona("Maria", 25));
        personas.add(new Persona("Ana", 22));
        personas.add(new Persona("Pedro", 28));

        //inserto en la 2da posicion una nueva persona
        personas.add(1, new Persona("Luis", 27));

        //modifico el dato de la persona en la posicion 2
        personas.set(2, new Persona("Ana", 23));

        //modifico solo la edad de Ana a 45 años
        personas.get(2).setEdad(45);

        //elimino a la persona en la posicion 3
        // personas.remove(3);

        //ingreso un objeto duplicado
        personas.add(new Persona("Juan", 30));

        // recorro la coleccion con foreach
            for (String nombre : nombres) {
                System.out.println(nombre);
            }

            System.out.println("-----------------");

            for (Integer numero : numeros) {
                System.out.println(numero);
            }

            System.out.println("-----------------");

            for (Persona persona : personas) {
                System.out.println(persona);
            }

            System.out.println("-----------------");

            //recorro personas con patron Iterator
            Iterator<Persona> iterator = personas.iterator();
            while (iterator.hasNext()) {
                Persona persona = iterator.next();
                System.out.println(persona);
            }
    }
}
