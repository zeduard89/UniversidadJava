package ar.com.sg.datos;

import ar.com.sg.pruebajpa2.domain.Persona;
import jakarta.ejb.Stateless;
import jakarta.persistence.*;
import java.util.List;

// Esta clase debe ser un EJB(Enterprise Java Bean) "Usar @Stateless 
//para puede inyectarse El "entity Manager" de JPA

@Stateless
public class PersonaDatoImpl implements PersonaDao{
    
    @PersistenceContext(unitName="PersonaPU")
    EntityManager em;

    @Override
    public List<Persona> findAllPersonas() {
        return em.createNamedQuery("Persona.findAll").getResultList();
    }

    @Override
    public Persona findPersonaById(Persona persona) {
        return em.find(Persona.class, persona.getIdPersona());
    }

    @Override
    public Persona findPersonaByEmail(Persona persona) {
        Query query = em.createQuery("from persona p where p.email =: email");
        query.setParameter("email", Persona.getEmail());
        return query.getSingleResult();
    }

    @Override
    public void insertPersona(Persona persona) {
    }

    @Override
    public void updatePersona(Persona persona) {
    }

    @Override
    public void deletePersona(Persona persona) {
    }
}
