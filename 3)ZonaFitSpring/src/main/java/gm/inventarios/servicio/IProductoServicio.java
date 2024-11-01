package gm.inventarios.servicio;

import gm.inventarios.modelo.Producto;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;

public interface IProductoServicio {

    public List<Producto> listarProducto();

    public Producto buscarProductoPorId(Integer idProducto);

    // Inserta o actualiza un producto segun si tiene o no Id
    public void gardarProducto(Producto producto);

    public void eliminarProductoPorId(Integer idProducto);
}
