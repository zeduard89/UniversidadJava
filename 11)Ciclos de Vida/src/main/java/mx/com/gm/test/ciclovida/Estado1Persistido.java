
package mx.com.gm.test.ciclovida;

import jakarta.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado1Persistido {
    
    public static void main(String[] args) {
        
        // *Se recomendiendo envolverlo en una Try/Catch
        
        // Abir Conexion con la DB
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //1. Estado Transitivo "Aun no tiene representacion en la DB"
        Contacto contacto = new Contacto();
        contacto.setEmail("clara");
        contacto.setTelefono("11224455");
        
        //2. Persistimos el objeto "Guardamos en la DB"
        em.getTransaction().begin();
        em.persist(contacto);
        em.getTransaction().commit();
        
        //3. Detached (Separado)
        System.out.println("contacto = " + contacto);
    }
        
}
