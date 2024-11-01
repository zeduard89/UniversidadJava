package zona_fit.presentacion;


import zona_fit.datos.ClienteDAO;
import zona_fit.datos.IClienteDao;
import zona_fit.dominio.Cliente;

import java.util.Scanner;

public class ZonaFitAPP {
    public static void main(String[] args) {
        zonaFitAPP();

    }

    private static void zonaFitAPP(){
        var salir = false;
        var consola = new Scanner(System.in);
        // Creamos un objeto de la clase clienteDao
        IClienteDao clienteDao = new ClienteDAO();
        while(!salir){
            try{
                var opcion = mostrarMenu(consola);
                salir = ejecutarOpciones(consola, opcion, clienteDao);
            }catch(Exception e){
                System.out.println("Error al ejecutar opciones: " + e.getMessage());
                System.out.println();
            }
        }
    }
    private static int mostrarMenu(Scanner consola){
        System.out.println("""
                    *** Zona Fit (GYM)
                    1. Listar Cliente
                    2. Buscar Cliente
                    3. Agregar Cliente
                    4. Modificar Cliente
                    5. Eliminar Cliente
                    6. Salir
                    Elije una opcion:\s""");
        return Integer.parseInt(consola.nextLine());
    }

    private static boolean ejecutarOpciones(Scanner consola, int opcion , IClienteDao clienteDAO){
        var salir = false;
        switch(opcion){
            case 1 -> {
                //Listar clientes
                System.out.println("--- Listado de Clientes ---");
                var clientes = clienteDAO.listarClientes();
                clientes.forEach(System.out::println);
            }
            case 2 ->{
                //Buscar cliente
                System.out.print("Intruoduce el Id del cliente a buscar: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var encontrado = clienteDAO.buscarClientePorId(cliente);
                if(encontrado)
                    System.out.println("Cliente encontrado: " + cliente);
                else{
                    System.out.println("Cliente No encontrado: " + cliente);
                }
            }
            case 3 -> {
                // Agregar cliente
                System.out.println("--- Agregar cliente ---");
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());
                // Creamos el objeto cliente (sin el ID)
                var cliente = new Cliente(nombre, apellido, membresia);
                var agregado = clienteDAO.agregarCliente(cliente);
                if(agregado)
                    System.out.println("Cliente agregado: " + cliente);
                else
                    System.out.println("Cliente NO agregado: " + cliente);
            }

            case 4 -> {
                // Modificar cliente existente
                System.out.println(" --- Modificar Cliente ---");
                System.out.println("Id cliente: ");
                var idCliente = Integer.parseInt(consola.nextLine());
                System.out.println("Nombre: ");
                var nombre = consola.nextLine();
                System.out.println("Apellido: ");
                var apellido = consola.nextLine();
                System.out.println("Membresia: ");
                var membresia = Integer.parseInt(consola.nextLine());
                // Creamos el objeto a modificar
                var cliente = new Cliente(idCliente,nombre, apellido, membresia);
                var modificado = clienteDAO.modificarCliente(cliente);
                if(modificado)
                    System.out.println("Cliente modificado: " + cliente);
                else
                    System.out.println("Cliente NO modificado: " + cliente);
            }

            case 5 ->{
                //Eliminar Cliente
                System.out.println("--- Eliminar Cliente ---");
                System.out.println("Id Cliente:");
                var idCliente = Integer.parseInt(consola.nextLine());
                var cliente = new Cliente(idCliente);
                var eliminado = clienteDAO.eliminarCliente(cliente);
                if(eliminado)
                    System.out.println("Cliente eliminado: " + cliente);
                else
                    System.out.println("Cliente NO eliminado: " + cliente);
            }

            case 6 ->{
                // Salir del sistema
                System.out.println("Hasta pronto!");
                salir = true;
            }

            default -> System.out.println("Opcion no reconocida " + opcion);
        }
        return salir;

    }

}
