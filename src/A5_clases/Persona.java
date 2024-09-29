package A5_clases;

public class Persona {
    private String nombre;
    private String apellido;

    public void mostrarPersona(){
        System.out.println("nombre = " + this.nombre);
        System.out.println("apellido = " + this.apellido);
    }

    public Persona() {
        System.out.println("Ejecutando el constructor Vacio");
    }

    //public Persona(String nombre,String apellido) {
    //    System.out.println("Ejecutando el constructor");
    //    this.nombre = nombre;
    //    this.apellido = apellido;
    //}

    //public String getNombre() {
    //    return nombre;
    //}

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    //public String getApellido() {
    //    return apellido;
    //}

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}

