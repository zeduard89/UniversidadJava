package B5_maquinaSnack_archivos.servicio;

import B5_maquinaSnack_archivos.dominio.Snack;

import java.util.List;

public interface IServicioSnacks {
    void agregarSnack(Snack snack);
    void mostrarSnacks();
    List<Snack> getSnacks();
}
