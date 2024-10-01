package B6_archivos;

import java.io.File;
import java.io.FileWriter;
import java.io.PrintWriter;

public class AgregarContenido {
    public static void main(String[] args) {
        boolean anexar = false;
        var nombreArchivo = "./src/B6_archivos/mi_archivo.txt";
        var archivo = new File(nombreArchivo);
        try{
            //Revisar si existe el archivo y anexar la nueva info
            anexar = archivo.exists();
            var salida = new PrintWriter(new FileWriter(archivo, anexar));
            var nuevoContenido = "Nuevo\ncontenido";
            salida.println(nuevoContenido);
            salida.close();
            System.out.println("Se agrego contenido al archivo...");

        }catch(Exception e){
            System.out.println("Error al escribir al archivo" + e.getMessage());
            e.printStackTrace();

        }
    }
}
