package variablesJava;

public class Variables {
    public static void main(String[] args) {

        // Detalle de un libro
        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;

        System.out.println(tituloLibro);
        System.out.println(anioPublicacion);
        System.out.println(libroDisponible);
        System.out.println(precio);

        // Detalle Persona

        String nombreCompleto = "Guillermo Eduardo Paez";
        int edad = 35;
        double altura = 1.80;
        String paisDeOrigina = "Argentina";
        char estadoCivil = 'C';
        System.out.println(
                "Nombre Completo:" + nombreCompleto+ "\n" +
                        "Edad:" + edad+ "\n" +
                        "Altura:" + altura + "\n" +
                        "Pais:" + paisDeOrigina+ "\n" +
                        "Estado Civil:" + estadoCivil );

    }
}
