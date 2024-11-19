package mx.com.gm.test.ciclovida;
import jakarta.persistence.*;
import mx.com.gm.domain.Contacto;


public class Estado2RecuperarObjetoPersistente {
    
    public static void main(String[] args) {
        

        // Abir Conexion con la DB
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //Recuperamoe un objeto de la DB
        Contacto contacto = null;
        contacto = em.find(Contacto.class, 3);
        
        //Estado Detached
        System.out.println("contacto = " + contacto);
    }
}
