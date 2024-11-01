package zona_fit.datos;

import zona_fit.dominio.Cliente;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

//Import static de mi tipo conexion(metodo def en clase conexion)
import static zona_fit.conexion.Conexion.getConexion;
// import zona_fit.conexion.Conexion;


public class ClienteDAO implements IClienteDao{

    @Override
    public List<Cliente> listarClientes() {
        List<Cliente> clientes = new ArrayList<>();
        //Para conectar a la DB y poder ejecutar las consultas
        PreparedStatement ps;
        ResultSet rs; //Permite recibir el resultado de la consulta
        Connection con = getConexion();

        var sql = "SELECT * FROM cliente ORDER by id";
        try{
            ps = con.prepareStatement(sql); //preparo la consulta
            rs = ps.executeQuery();         //ejecuto la consulta
            while(rs.next()){//itero cada uno de los resultados
                var cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                clientes.add(cliente);
            }
        }catch(Exception e ){
            System.out.println("Error al listar clientes: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Error al cerrar conexion: " + e.getMessage());
                e.printStackTrace();
            }

        }
        return clientes;
    }

    @Override
    public boolean buscarClientePorId(Cliente cliente) {
        PreparedStatement ps;
        ResultSet rs;
        Connection con = getConexion();
        var sql = "SELECT * FROM cliente WHERE id = ?";
        try{
            ps = con.prepareStatement(sql);
            //Pasamos el parametros posicionales -> ? Id,
            // "utilizo indice 1 xQ los parametros comienzan en 1"
            ps.setInt(1,cliente.getId());
            rs = ps.executeQuery();
            if(rs.next()){ //Control obtencion de registro
                cliente.setNombre(rs.getString("nombre"));
                cliente.setApellido(rs.getString("apellido"));
                cliente.setMembresia(rs.getInt("membresia"));
                return true;
            }
        }catch(Exception e){
            System.out.println("Error al recuperar cliente por id: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Error al cerrar conexion: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean agregarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "INSERT INTO cliente(nombre, apellido, membresia)"
                + " " + "VALUES(?, ?, ?)";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1,cliente.getNombre());
            ps.setString(2, cliente.getApellido());
            ps.setInt(3,cliente.getMembresia());
            ps.execute(); //Ejecuto consulta
            return true;
        }catch(Exception e){
            System.out.println("Error al agregar cliente: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Error al cerrar conexion: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean modificarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        var sql = "UPDATE cliente SET nombre=?, apellido=?, membresia=? " +
                "WHERE id = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1,cliente.getNombre());
            ps.setString(2,cliente.getApellido());
            ps.setInt(3,cliente.getMembresia());
            ps.setInt(4,cliente.getId());
            ps.execute();
            return true;
        }catch(Exception e){
            System.out.println("Error al modificar cliente: " + e.getMessage());
            e.printStackTrace();
        }
        finally {
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Error al cerrar conexion: " + e.getMessage());
                e.printStackTrace();
            }
        }
        return false;
    }

    @Override
    public boolean eliminarCliente(Cliente cliente) {
        PreparedStatement ps;
        Connection con = getConexion();
        String sql = "DELETE FROM cliente WHERE id = ?";
        try{
            ps = con.prepareStatement(sql);
            ps.setInt(1, cliente.getId());
            ps.execute();
        }catch(Exception e){
            System.out.println("Error al eliminar cliente " + e.getMessage());
        }finally {
            try{
                con.close();
            }catch(Exception e){
                System.out.println("Error al cerrar conexion " + e.getMessage());
            }

        }

        return false;
    }

    public static void main(String[] args) {
        IClienteDao clienteDao = new ClienteDAO();

        //Lista clientes (prueba)
        /*
        System.out.println("*** Listar Clientes ***");
        var clientes = clienteDao.listarClientes();
        clientes.forEach(System.out::println);
        */


        //Buscar por Id
        /*
        var cliente1 = new Cliente(2);
        System.out.println("Cliente antes de la busqueda: " + cliente1);
        var encontrado = clienteDao.buscarClientePorId(cliente1);
        if(encontrado)
            System.out.println("Cliente encontrado: " + cliente1);
        else
            System.out.println("No se encontro cliente: " + cliente1.getId());

         */

        //Agregar cliente
        /*
        var nuevoCliente = new Cliente("Daniel","Ortiz",300);
        var agregado = clienteDao.agregarCliente(nuevoCliente);
        if(agregado){
            System.out.println("Cliente agregado: " + nuevoCliente);
        }else{
            System.out.println("No se agregao el cliente: " + nuevoCliente);
        }
        */
        // Modificar Cliente
        /*
        var modificarCliente = new Cliente(5,"Carlos Daniel", "Ortiz", 300);
        var modificado = clienteDao.modificarCliente(modificarCliente);
        if(modificado)
            System.out.println("Cliente modificado: " + modificarCliente);
        else
            System.out.println("No se modifico cliente: " + modificarCliente);
        */

        //Eliminar Cliente
        var clienteEliminar = new Cliente(5);
        var eliminado = clienteDao.eliminarCliente(clienteEliminar);
        if(eliminado)
            System.out.println("Cliente eliminado: " + clienteEliminar);
        else
            System.out.println("No se elimino el cliente: " + clienteEliminar);

        System.out.println("*** Listar Clientes ***");
        var clientes = clienteDao.listarClientes();
        clientes.forEach(System.out::println);

    }
}
