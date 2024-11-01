import { Component } from '@angular/core';
import { Producto } from '../producto';
import { ProductoService } from '../producto.service';

@Component({
  selector: 'app-producto-lista',
  templateUrl: './producto-lista.component.html',
})
export class ProductoListaComponent {
  productos: Producto[];

  constructor(private productoServicio: ProductoService) {}

  ngOnInit(){
    //Cargamos todos los productos
    this.obtenerProductos();
  }

  private obtenerProductos(){
    //consumimos los datos del observable(suscribimos)
    this.productoServicio.obtenerProductosLista().subscribe
    (datos=> {
        this.productos= datos;
      }
    );
  }
}
