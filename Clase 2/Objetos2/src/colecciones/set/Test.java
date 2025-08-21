package colecciones.set;

import java.util.Set;
import java.util.TreeSet;
import java.util.HashSet;
import java.util.LinkedHashSet;



public class Test {
    public static void main(String[] args) {
        // HashSet<Persona> personas = new HashSet<>();
        // LinkedHashSet<Persona> personas = new LinkedHashSet<>();
        TreeSet<Persona> personas = new TreeSet<>();
        TreeSet<Integer> numeros = new TreeSet<>();
        TreeSet<String> nombres = new TreeSet<>();

        personas.add(new Persona("Juan", 30));
        personas.add(new Persona("Maria", 25));
        personas.add(new Persona("Ana", 22));
        personas.add(new Persona("Pedro", 28));

        // Agregamos algunos números
        numeros.add(5);
        numeros.add(3);
        numeros.add(8);
        numeros.add(1);

        // Agregamos algunos nombres
        nombres.add("Juan");
        nombres.add("Maria");
        nombres.add("Ana");
        nombres.add("Pedro");

        // Intentamos agregar un duplicado
        personas.add(new Persona("Juan", 30));
        

        // Mostramos el contenido del conjunto
        for (Persona persona : personas) {
            System.out.println(persona);
        }

        System.out.println("Contenido del conjunto de números:");
        for (Integer numero : numeros) {
            System.out.println(numero);
        }

        System.out.println("Contenido del conjunto de nombres:");
        for (String nombre : nombres) {
            System.out.println(nombre);
        }
    }
}
