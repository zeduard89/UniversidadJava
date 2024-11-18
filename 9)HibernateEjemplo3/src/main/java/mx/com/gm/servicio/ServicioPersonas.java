package mx.com.gm.servicio;

//Clase utilizado por Enterprise Java Beans o Framework Spring

import java.util.List;
import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

//Para convertila en clases Transaccionales
public class ServicioPersonas {
    
    private PersonaDAO personaDao;
    
    public ServicioPersonas(){
        this.personaDao = new PersonaDAO();
    }
    

    public List<Persona> listarPersonas() {
        return this.personaDao.listar();
    }
}
