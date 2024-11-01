package gm.inventarios.servicio;

import gm.inventarios.modelo.Producto;
import gm.inventarios.repositorio.ProductoRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductoServicio implements IProductoServicio{

    // Comunicarnos con la capa repositorio
    @Autowired
    private ProductoRepositorio productoRepositorio;

    @Override
    public List<Producto> listarProducto() {
        return this.productoRepositorio.findAll();
    }

    @Override
    public Producto buscarProductoPorId(Integer idProducto) {
        return  this.productoRepositorio.findById(idProducto).orElse(null);
    }

    @Override
    public void gardarProducto(Producto producto) {
        this.productoRepositorio.save(producto);
    }

    @Override
    public void eliminarProductoPorId(Integer idProducto) {
        this.productoRepositorio.deleteById(idProducto);
    }
}
