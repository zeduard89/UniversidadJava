package B4_mapas;

import java.util.HashMap;
import java.util.Map;


public class Mapas {
    public static void main(String[] args) {
        Map<String, String> persona = new HashMap<>();
        persona.put("Nombre","Diego");
        persona.put("Apellido","Flores");
        persona.put("Edad","31");
        //persona.put("Edad","31"); no se permiten duplicados

        System.out.println("Valores del mapa o diccionario: ");
        persona.entrySet().forEach(System.out::println);
        persona.put("Edad","35");

        System.out.println("\nNuevos Valores del mapa o diccionario: ");
        persona.entrySet().forEach(System.out::println);

        //Iterar los elementos del mapa por separado
        persona.forEach((key,value)->{
            System.out.println("Llave: " + key + "\nValor: " + value);
        });


    }
}
