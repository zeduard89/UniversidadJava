package B5_maquinaSnack_archivos.servicio;

import B5_maquinaSnack_archivos.dominio.Snack;

import java.util.List;

public interface IServicioSnacks {
    void agregarSnack(Snack snack);
    void mostrarSnacks();
    List<Snack> getSnacks();

}

/*
Las interfaces en Java son plantillas que contienen métodos
abstractos (sin implementación), y las clases que implementen
esta interfaz deberán proporcionar su propia implementación
de estos métodos.
 */
