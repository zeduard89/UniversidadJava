package mx.com.gm.domain;

import lombok.Data;

//Genera los metodos automaticamente
@Data
public class Persona {
    
    private String nombre;
    private String apellido;
    private String email;
    private String telefono;
}
