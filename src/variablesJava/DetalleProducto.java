package variablesJava;

public class DetalleProducto {
    public static void main(String[] args) {
        String nombreDelProducto = "Jamon";
        double precio = 10.5;
        int cantidadDisponible = 10;
        boolean isDisponible = true;

        System.out.println(
                "Nombre del Producto: "  + nombreDelProducto + "\n" +
                "Precio: " + precio + "\n" +
                "Cantidad Disponible: " + cantidadDisponible + "\n" +
                "Hay Stock: "+ isDisponible);

        nombreDelProducto = "Queso";
        precio = 20.4;
        cantidadDisponible = 0;
        isDisponible = false;

        System.out.println(
                "Nombre del Producto: "  + nombreDelProducto + "\n" +
                        "Precio: " + precio + "\n" +
                        "Cantidad Disponible: " + cantidadDisponible + "\n" +
                        "Hay Stock: "+ isDisponible);
    }
}
