package mx.com.gm.dao;

import jakarta.persistence.*;
import java.util.List;
import mx.com.gm.domain.Persona;


//DAO "Data Access Object"
//DTO "Data Transfer Object"
public class PersonaDAO {
    private EntityManagerFactory emf;
    private EntityManager em;
    
    public PersonaDAO(){
        emf = Persistence.createEntityManagerFactory("HibernatePU");
        em = emf.createEntityManager();
    }
    
    public List<Persona> listar(){
        String hql = "SELECT p FROM Persona p";
        Query query = em.createQuery(hql);
        List<Persona> personas = query.getResultList();
//        for(Persona p: personas){
//            System.out.println("p = " + p);
//        }
        return personas;
    }
    
    // Como no desplegamos la app en un servidor empresarial "ej:glassFish"
    // Debemos abrir y cerrar la transaccion
    public void insertar(Persona persona){
        try{
        em.getTransaction().begin();
        em.persist(persona);
        em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
        finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    public void modificar(Persona persona){
        try{
        em.getTransaction().begin();
        em.merge(persona);
        em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
        finally{
            if(em != null){
                em.close();
            }
        }
    }
    
    // SI solo recuperamos info, no es necesario realizar transaccion
    public Persona buscarPersonaPorId(Persona p){
        return em.find(Persona.class, p.getIdPersona());
    }
    
    public void eliminar (Persona persona){
        try{
        em.getTransaction().begin();
        //Primero sincronizamos cualquier cambio que tenemos en la DB
        //luego se puede eliminar
        em.remove(em.merge(persona));
        em.getTransaction().commit();
        }catch(Exception ex){
            ex.printStackTrace(System.out);
            em.getTransaction().rollback();
        }
//        finally{
//            if(em != null){
//                em.close();
//            }
//        }
    }
    
}
