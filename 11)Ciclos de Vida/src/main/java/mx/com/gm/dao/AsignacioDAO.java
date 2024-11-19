package mx.com.gm.dao;

import jakarta.persistence.Query;
import java.util.List;
import mx.com.gm.domain.Asignacion;


public class AsignacioDAO extends GenericDAO{
    
    public List<Asignacion> listar() {
        String asignacion = "SELECT d FROM Asignacion d";
        em = getEntityManager(); //Recuperamos una instancia
        Query query = em.createQuery(asignacion);
        return query.getResultList();
    }

    public void insertar(Asignacion domicilio) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(domicilio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void actualizar(Asignacion domicilio) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(domicilio);
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void eliminar(Asignacion domicilio) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(domicilio));
            em.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public Object buscarPorId (Asignacion domicilio){
        em = getEntityManager();
        return em.find(Asignacion.class, domicilio.getIdAsignacion());
    }
}
