package mx.com.gm.service;

import java.util.List;
import mx.com.gm.dao.IPersonaDao;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service //Capa de Servicio
public class PersonaServiceImp implements IPersonaService {
    
    @Autowired // Union con capa de Datos
    private IPersonaDao personaDao;
    
    @Override
    @Transactional(readOnly = true)//Anotacion "Solo lectura"
    public List<Persona> listarPersonas() {
        return (List<Persona>) personaDao.findAll();
    }

    @Override
    @Transactional //como se realiza un commit o rollback
    public void guardar(Persona persona) {
        personaDao.save(persona);
    }

    @Override
    @Transactional
    public void eliminar(Persona persona) {
        personaDao.delete(persona);
    }

    @Override
    @Transactional(readOnly = true)
    public Persona encontrarPersona(Persona persona) {
        return personaDao.findById(persona.getIdPersona()).orElse(null);
        
    }
    
    
    
}
