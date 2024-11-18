package test;

import mx.com.gm.dao.PersonaDAO;
import mx.com.gm.domain.Persona;

public class OperacionesHibernateJPA {
    public static void main(String[] args) {
        PersonaDAO personaDao = new PersonaDAO();
        
//      Find
        personaDao.listar();
               
//        Create
//        Persona persona = new Persona();
//        persona.setNombre("Carla");
//        persona.setApellido("APellido");
//        persona.setEmail("Carla@hotmail.com");
//        persona.setApellido("1122335445");
//        personaDao.insertar(persona);
        
//        Update        
//        Persona persona = new Persona();
//        persona.setIdPersona(15);
//        persona.setNombre("modificado");
//        persona.setApellido("modificado");
//        persona.setEmail("modificado@hotmail.com");
//        persona.setApellido("modificado");
//        personaDao.modificar(persona);

//        Eliminar
          Persona persona = new Persona();
          persona.setIdPersona(15);
          persona = personaDao.buscarPersonaPorId(persona);
          System.out.println("Persona Encontrada = " + persona);
          personaDao.eliminar(persona);
    }
    
}
