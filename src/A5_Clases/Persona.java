package A5_Clases;

public class Persona {
    String nombre;
    String apellido;

    void mostrarPersona(){
        System.out.println("nombre = " + nombre);
        System.out.println("apellido = " + apellido);
    }

    public Persona() {
        System.out.println("Ejecutando el constructor Vacio");
    }

    public Persona(String arg1,String arg2) {
        System.out.println("Ejecutando el constructor");
        nombre = arg1;
        apellido = arg2;
    }

    public static void main(String[] args) {
        System.out.println("*** Creacion de clase y objetos tipo Persona ***");

        //Constructor Vacio
        var objeto1 = new Persona();
        objeto1.nombre = "Layla";
        objeto1.apellido = "Acosta";
        objeto1.mostrarPersona();

        //Usando Constructor
        var objeto2 = new Persona("Ian","Gomez");
        //objeto2.nombre = "Ian";
        //objeto2.apellido = "Gomez";
        objeto2.mostrarPersona();
    }

}

