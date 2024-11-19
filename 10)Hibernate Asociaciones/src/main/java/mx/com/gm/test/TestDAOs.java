package mx.com.gm.test;

import java.util.List;
import mx.com.gm.dao.AlumnoDAO;
import mx.com.gm.dao.ContactoDAO;
import mx.com.gm.dao.DomicilioDAO;


public class TestDAOs {
    
    public static void main(String[] args) {
        AlumnoDAO alumnoDao = new AlumnoDAO();
        System.out.println("Alumnos: ");
        imprimir(alumnoDao.listar());
        
        DomicilioDAO domicilioDao = new DomicilioDAO();
        System.out.println("Domicilio: ");
        imprimir(domicilioDao.listar());
        
        ContactoDAO ContactoDao = new ContactoDAO();
        System.out.println("Contacto: ");
        imprimir(ContactoDao.listar());
    }
    
    private static void imprimir(List coleccion){
        for(Object o: coleccion){
            System.out.println("Valor =" + o);
        }
    }
}
