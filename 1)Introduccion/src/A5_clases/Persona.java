package A5_clases;

public class Persona {

    private static int contadorPersonas = 0;
    private String nombre;
    private String apellido;
    final private int idPersona;

    public void mostrarPersona(){
        System.out.println("nombre = " + this.nombre);
        System.out.println("apellido = " + this.apellido);
        System.out.println("Id: " + this.idPersona);
    }

    public Persona() {
        System.out.println("Ejecutando el constructor Vacio");
        // Incrementar el atributo static
        this.idPersona = ++Persona.contadorPersonas;
    }

    @Override
    public String toString(){
        return
                "Nombre: " + this.nombre + ", Apellido: " + this.apellido;
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

    public static int getContadorPersonas() {
        return Persona.contadorPersonas;
    }
}

