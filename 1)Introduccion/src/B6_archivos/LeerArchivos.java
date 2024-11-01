package B6_archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class LeerArchivos {
    public static void main(String[] args) {
        var nombreArchivo = "./src/B6_archivos/mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try{
            System.out.println("Contenido del archivo: ");

            //Abrir el archivo para lectura
            var entrada = new BufferedReader(new FileReader(archivo));

            //Leemos linea a linea el archivo
            var linea = entrada.readLine();
            while(linea != null){
                System.out.println(linea);
                linea = entrada.readLine();
            }

            //Cerramos el recurso
            entrada.close();

        }catch(Exception e){
            System.out.println("Error al leer archivo: " + e);
        }
    }
}
