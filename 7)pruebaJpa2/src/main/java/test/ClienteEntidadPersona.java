package test;

import ar.com.sg.pruebajpa2.domain.Persona;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;
import org.apache.logging.log4j.*;

public class ClienteEntidadPersona {
    static Logger log = LogManager.getRootLogger();
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("PersonaPU");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        
        //Inicia la transaccion
        tx.begin();
        
        //No se debe especificar el ID de la DB
        Persona persona1 = new Persona("Maria", "Gutierrez","mGutierrez2@hotmail.com", "123456");
        log.debug("Objeto a persisitir: " + persona1);
        //Persistir objeto
        em.persist(persona1);
        //Terminamos la transaccion
        tx.commit();
        log.debug("Objeto persistido " + persona1);
        em.close();
    }
}
