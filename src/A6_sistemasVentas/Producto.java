package A6_sistemasVentas;

public class Producto {
    final private int idProducto;
    private final String nombre;
    private final double precio;
    private static int contadorProductos;

    public Producto(String nombre, double precio){
        this.idProducto = ++contadorProductos;
        this.nombre = nombre;
        this.precio = precio;
    }

    //public void setNombre(String nombre) {
    //    this.nombre = nombre;
    //}

    public double getPrecio() {
        return this.precio;
    }

    //public void setPrecio(double precio) {
    //    this.precio = precio;
    //}

    //public int getIdProducto() {
    //    return this.idProducto;
    //}

    @Override
    public String toString() {
        return "Producto{" +
                "idProducto=" + this.idProducto +
                ", nombre='" + this.nombre + '\'' +
                ", precio=" + this.precio +
                '}';
    }
}
