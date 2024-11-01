package gm.inventarios.repositorio;

import gm.inventarios.modelo.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

// Simplifica: metodos para comunicarnos con la base de datos
public interface ProductoRepositorio extends JpaRepository<Producto, Integer> {

}
