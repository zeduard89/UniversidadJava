package mx.com.gm.service;

import java.util.List;
import mx.com.gm.domain.Persona;


public interface IPersonaService {
    
    public List<Persona> listarPersonas();
    
    public void guardar (Persona persona);
    
    public void eliminar (Persona persona);
    
    public Persona encontrarPersona (Persona persona);
}
