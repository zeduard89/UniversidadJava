package B2_datosPorConsola;

import java.util.Scanner;

public class EjSistemaEmpleados {
    public static void main(String[] args) {

        var consola = new Scanner(System.in);

        System.out.println("Nombre del empleado: ");
        var nombreEmpleado = consola.nextLine();

        System.out.println("Edad del empleado");
        var edadEmpleado = Integer.parseInt(consola.nextLine());

        System.out.println("Salario empleado");
        var salarioEmpleado = Double.parseDouble(consola.nextLine());

        System.out.println("Es jefe de departamente (true/false)");
        var esJefeDepartamento = Boolean.parseBoolean(consola.nextLine());

        // Imprimir valores
        System.out.println("\n Datos de Empleados");
        System.out.println("\t Nombre: " + nombreEmpleado);
        System.out.println("\t Edad: " + edadEmpleado);
        System.out.println("\t Salario: " + salarioEmpleado);
        System.out.println("\t Es Jefe de Departamento: " + esJefeDepartamento);

        // String Format
        var mensaje = String.format("Nombre: %s Edad: %d Salario: %.2f"
                                    ,nombreEmpleado, edadEmpleado, salarioEmpleado);
        System.out.println("mensaje = " + mensaje);

        // Metodo Printf        %n "salto de linea"
        System.out.printf("Nombre: %s%n Edad: %d%n Salario: %.2f%n"
                        ,nombreEmpleado, edadEmpleado, salarioEmpleado);
    }
}
