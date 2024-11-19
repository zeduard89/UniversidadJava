package mx.com.gm.test.ciclovida;

import jakarta.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado4EliminarObjeto {

    public static void main(String[] args) {

        // Abir Conexion con la DB
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();

        //1.Recuperamoe un objeto de la DB "Estado Transitivo"
        Contacto contacto = null;
        contacto = em.find(Contacto.class, 3);

        //2. Eliminamos de la DB
        em.getTransaction().begin();
        em.remove(em.merge(contacto));
        em.getTransaction().commit();

        //Estado Transitivo "Se elimina por el Recolector de B."
        System.out.println("contacto = " + contacto);
    }
}
