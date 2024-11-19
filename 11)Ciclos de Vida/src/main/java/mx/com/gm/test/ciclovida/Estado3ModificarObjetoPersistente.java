package mx.com.gm.test.ciclovida;

import jakarta.persistence.*;
import mx.com.gm.domain.Contacto;


public class Estado3ModificarObjetoPersistente {
    
    public static void main(String[] args) {
        

        // Abir Conexion con la DB
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //1.Recuperamoe un objeto de la DB "Estado Transitivo"
        Contacto contacto = null;
        contacto = em.find(Contacto.class, 3);
        
        //2. Modificamos el objeto
        contacto.setEmail("clara@hotmail.com");
        
        //3. Persistimos el objeto con "merge() o persist()->x1time"
        em.getTransaction().begin();
        em.merge(contacto);
        em.getTransaction().commit();        
        
        //Estado Detached
        System.out.println("contacto = " + contacto);
    }
}
