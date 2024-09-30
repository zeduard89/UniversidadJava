package B1_JavaBean;

import java.io.Serializable;

//Standar para crear objetos y se pueden modificar y leer los atributos
// tambien la aplicacion de serializable para frameworks...
public class JavaBean {
    public static void main(String[] args) {
        Persona persona = new Persona();
        persona.setNombre("Karla");
        persona.setApellido("Lara");
        System.out.println("persona = " + persona);
        System.out.println("Nombre: " + persona.getNombre());
        System.out.println("Apellido: " + persona.getApellido());
    }
}

// Condiciones
// -Constructor Vacio
// -Encapsulamiento
// - Implementar interfase Serializable
class Persona implements Serializable {
    private String nombre;
    private String apellido;

    public Persona(){}

    public String getApellido() {
        return this.apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                '}';
    }
}