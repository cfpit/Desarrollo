package colecciones.mapas;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class Test {
    public static void main(String[] args) {
        //diccionario ingles español de colores
        // HashMap<String, String> diccionario = new HashMap<>();//sin orden
        // LinkedHashMap<String, String> diccionario = new LinkedHashMap<>();//orden de insercion
        TreeMap<String, String> diccionario = new TreeMap<>();//orden alfabetico



        diccionario.put("rojo", "red");
        diccionario.put("verde", "green");
        diccionario.put("azul", "blue");
        diccionario.put("amarillo", "yellow");

        //contenido del mapa
        for (String color : diccionario.keySet()) {
            String traduccionColor = diccionario.get(color);
            System.out.println("La traducción de '" + color + "' es: " + traduccionColor);
        }

        // Acceder a una traducción
        // String traduccion = diccionario.get("rojo");
        // System.out.println("La traducción de 'rojo' es: " + traduccion);
    }
}
