package B5_maquinaSnack_archivos.servicio;

import B5_maquinaSnack_archivos.dominio.Snack;

import java.util.ArrayList;
import java.util.List;

public class ServicioSnacksLista implements IServicioSnacks {
    private static final List<Snack> snacks;

    //Bloque static Inicializador "cuando no se desea crear objetos",Similar a un constructor
    //Inicializo la lista de snacks y creo otros
    static{
        snacks = new ArrayList<>();
        snacks.add(new Snack("Papas",70));
        snacks.add(new Snack("Refresco",50));
        snacks.add(new Snack("Sandwich",120));
    }

    public void agregarSnack(Snack snack){
        snacks.add(snack);
    }

    public void mostrarSnacks(){
        var inventarioSnacks = "";
        for(var snack: snacks){
            inventarioSnacks += snack.toString() + "\n";
        }
        System.out.println("--- Snacks en el inventario ---");
        System.out.println(inventarioSnacks);
    }

    public List<Snack> getSnacks(){
        return snacks;
    }

}
