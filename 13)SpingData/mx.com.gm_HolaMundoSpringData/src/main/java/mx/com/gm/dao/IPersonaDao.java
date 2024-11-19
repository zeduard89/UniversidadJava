package mx.com.gm.dao;

import mx.com.gm.domain.Persona;
import org.springframework.data.repository.CrudRepository;

//Tipo de Entidad: Persona
//Tipo de llave Primaria: Long
public interface IPersonaDao extends CrudRepository<Persona, Long>{
    
    //Ya no es necesario crear una implementacion basicas
    //CrudRepository tiene por default. Se puede agregar personalizados
}
