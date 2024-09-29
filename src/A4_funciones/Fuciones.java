package A4_funciones;

public class Fuciones {

    static int sumar(int a, int b){

        return a + b;
    }

    static void saludar(String mensaje){
        System.out.println("Mensaje: " + mensaje);
    }

    static void funcionRecursica(int numero){
        if(numero == 1)
            System.out.print(numero + " ");
        else{

            funcionRecursica(numero - 1);
            System.out.print(numero + " ");
        }
    }


    public static void main(String[] args) {
        int arg1 = 3, arg2 = 8;
        String message = "Hola desde Java";

        var resultado_funcion = sumar(arg1,arg2);
        System.out.println("resultado_funcion = " + resultado_funcion);

        saludar(message);

        funcionRecursica(5);

    }
}
