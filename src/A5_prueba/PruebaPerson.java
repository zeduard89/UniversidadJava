package A5_prueba;

import A5_clases.Persona;

public class PruebaPerson {

    public static void main(String[] args) {
        System.out.println("*** Creacion de clase y objetos tipo Persona ***");

        //Constructor Vacio
        var objeto1 = new Persona();
        objeto1.setNombre("Layla");
        objeto1.setApellido("Acosta");
        objeto1.mostrarPersona();


    }
}
