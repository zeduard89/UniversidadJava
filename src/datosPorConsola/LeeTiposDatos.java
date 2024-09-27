package datosPorConsola;
import java.util.Scanner;
import java.util.zip.DeflaterOutputStream;

public class LeeTiposDatos {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);
        System.out.println("Ingrese tu edad");
        var edad = consola.nextInt();
        System.out.println("edad = " + edad);

        System.out.println("Ingrese tu altura");
        var altura = consola.nextDouble();
        System.out.println("altura = " + altura);
        
        //Consumimos el caracter salto de linea (a causa del uso de los metodos next-int/double)
        consola.nextLine();
        //Recien ahora puedo utilzar nextLine
        System.out.println("Ingrese tu nombre: ");
        var nombre = consola.nextLine();
        System.out.println("nombre = " + nombre);
        
        // Conversion de datos (cadena -> entero)
        System.out.println("Proporciona un valor entero");
        var enteroString = consola.nextLine();
        var entero = Integer.parseInt(enteroString);
        System.out.println("entero = " + entero);

        //(cadena -> flotante)
        System.out.println("Ingresa un valor flotante");
        var flotante = Float.parseFloat(consola.nextLine());
        System.out.println("flotante = " + flotante);

        // Double.parseDouble()
        // Boolean.parseBoolean()

    }
}
