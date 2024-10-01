package B5_maquinaSnack_archivos.dominio;

import java.io.Serializable;
import java.util.Objects;

// Agrego el Standard de JAVABEAN, ya que voy a crear objetos apartir de ella
public class Snack implements Serializable {
    private static int contadorSnack = 0;
    private int idSnack;
    private String nombre;
    private double precio;

    //Uso un constructor ya que quiero crear objetos de esta clase
    public Snack(){
        this.idSnack = ++Snack.contadorSnack;
    }

    public Snack(String nombre, double precio){
        this(); //Llamado al constructor vacio
        this.nombre = nombre;
        this.precio = precio;
    }

    public int getIdSnack() {
        return this.idSnack;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static void setContadorSnack(int contadorSnack) {
        Snack.contadorSnack = contadorSnack;
    }

    @Override
    public String toString() {
        return "Snack{" +
                "idSnack=" + idSnack +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                '}';
    }

    public String ecribirSnack(){
        return idSnack + "," + nombre + "," + precio;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Snack snack = (Snack) o;
        return idSnack == snack.idSnack && Double.compare(precio, snack.precio) == 0 && Objects.equals(nombre, snack.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idSnack, nombre, precio);
    }
}
