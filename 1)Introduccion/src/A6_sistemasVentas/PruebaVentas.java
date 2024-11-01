package A6_sistemasVentas;

public class PruebaVentas {
    public static void main(String[] args) {
        System.out.println("*** Sistemas de Ventas ***");

        var producto1 = new Producto("Blusa", 30.00);
        System.out.println("producto1 = " + producto1);

        var producto2 = new Producto("Zapatos", 50.00);
        System.out.println("producto2 = " + producto2);

        var orden1 = new Orden();
        orden1.agregarProductos(producto1);
        orden1.agregarProductos(producto2);
        orden1.mostrarOrden();

        var orden2 = new Orden();
        orden2.agregarProductos(producto1);
        orden2.agregarProductos(producto1);
        orden2.mostrarOrden();
    }
}
