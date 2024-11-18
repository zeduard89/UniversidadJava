package test;

import java.util.List;
import jakarta.persistence.*;
import mx.com.gm.domain.Persona;

public class HolaMundoHibernate {
    public static void main(String[] args) {
        String hql = "SELECT p FROM Persona p";
        EntityManagerFactory fabrica = Persistence.createEntityManagerFactory("HibernatePU");
        EntityManager entityManager = fabrica.createEntityManager();
        
        Query query = entityManager.createQuery(hql);
        List<Persona> personas = query.getResultList();
        for(Persona p: personas){
            System.out.println("Persona:" + p);
        }
    }
}
