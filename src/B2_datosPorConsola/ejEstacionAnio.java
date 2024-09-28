package B2_datosPorConsola;

import java.util.Scanner;

public class ejEstacionAnio {
    public static void main(String[] args) {
        System.out.println("*** Estacion del Año");

        var consola = new Scanner(System.in);

        System.out.println("Proporciona el valor del mes");
        var mes = Integer.parseInt(consola.nextLine());
        var estacion = "";

        if(mes == 1 || mes == 2 || mes == 12){
            estacion = "invierno";
        }else if (mes == 3 || mes == 4 || mes == 5){
            estacion = "primavera";
        }else if (mes == 6 || mes == 7 || mes == 8){
            estacion = "verano";
        }else if(mes == 9 || mes == 10 || mes == 11){
            estacion = "otoño";
        }else{
            estacion = "estacion desconocida" + mes;
        }

        System.out.printf("la estacion para el mes %d es %s ",mes,estacion);
    }
}
