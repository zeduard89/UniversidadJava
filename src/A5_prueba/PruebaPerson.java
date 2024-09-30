package A5_prueba;

import A5_clases.Persona;

public class PruebaPerson {

    public static void main(String[] args) {
        System.out.println("*** Creacion de clase y objetos tipo Persona ***");

        //Constructor Vacio
        var objeto1 = new Persona();
        System.out.println("Variable estatica: " + Persona.getContadorPersonas());

        objeto1.setNombre("Layla");
        objeto1.setApellido("Acosta");
        objeto1.mostrarPersona();

        var objeto2 = new Persona();
        System.out.println("Variable estatica: " + Persona.getContadorPersonas());
        objeto2.setNombre("Leo");
        objeto2.setApellido("Royer");
        objeto2.mostrarPersona();

        //METODO toString()
        System.out.println("Sobre escribiendo metodo toString de la clase padre");
        //System.out.println(objeto1.toString());
        // El metodo toString() se manda a llamar con sout...
        System.out.println(objeto1);


    }
}
