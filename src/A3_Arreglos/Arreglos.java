package A3_Arreglos;

public class Arreglos {
    public static void main(String[] args) {

        //A)Definimos la variable
        int[] enteros;
        // Inicializamos el arreglo -reservamos espacio en memoria
        enteros = new int[5];

        //B) Declarar e inicializar un arreglo
        // int [] numeros = new int[2];

        // Modificacion
        enteros[0] = 13;
        enteros[1] = 21;
        enteros[4] = 62;
        
        // Leer elementos de un arreglo
        System.out.println("enteros[0] = " + enteros[0]);

        //Simplificacion
        var enteros2 = new int[]{100,200,300,400,500};

        //Uso for...
        for (int i = 0; i < enteros2.length; i++) {
            System.out.println("enteros2"+ i + " = " + enteros2[i]);
        }
    }
}
