package com.mycompany.jpaprueba;
import com.mycompany.jpaprueba.logica.Alumno;
import com.mycompany.jpaprueba.logica.Carrera;
import com.mycompany.jpaprueba.logica.ControladoraLogica;
import com.mycompany.jpaprueba.logica.Materia;
import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;


public class JpaPrueba {

    public static void main(String[] args) {
                        
        ControladoraLogica controladoraLogica = new ControladoraLogica();
        
//        C-reate -----------------------
          
          //Lista Vacia
          LinkedList<Materia> listaMaterias = new LinkedList <Materia>();
          //Creacion de carrera con lista de materias Vacia
          Carrera carre = new Carrera(25,"Tecnicatura en Programacion", listaMaterias);
          //Guardado Carrera en la DB
          controladoraLogica.crearCarrera(carre);

          //Creacion materias
          Materia mate1 = new Materia(58,"Programacion I", "Cuatrimestral",carre);
          Materia mate2 = new Materia(55,"Programacion II", "Cuatrimestral",carre);
          Materia mate3 = new Materia(50,"Programacion III", "Anual",carre);
          
          //Guardado Materias en DB
          controladoraLogica.crearMateria(mate1);
          controladoraLogica.crearMateria(mate2);
          controladoraLogica.crearMateria(mate3);
          
          //agregamos a la lista las materias y actualizar carrera en DB
          listaMaterias.add(mate1);
          listaMaterias.add(mate1);
          listaMaterias.add(mate1);
          carre.setListaMaterias(listaMaterias);
          controladoraLogica.editarCarrera(carre);
          
          //Creacion alumno (con carrera)
          Alumno createdAlumno = new Alumno(23,"Luisina","Jpa", new Date(),carre);
          //Guardado Alumno en DB
          controladoraLogica.crearAlumno(createdAlumno);
          
          System.out.println("-------------");
          System.out.println("----Datos Alumnos ----");
          Alumno alu = controladoraLogica.traerAlumno(23);
          System.out.println("Alumno: " + alu.getNombre() + " " + alu.getApellido());
          System.out.println("Cursa la Carrera de: " + alu.getCarre().getNombre());
          
          
//        R-ead -------------------------
//            Alumno alu = controladoraLogica.traerAlumno(15);
//            System.out.println("---- Busqueda Individual ----");
//            System.out.println("El alumno es: " + alu.toString());
//            System.out.println("---- Busqueda Grupal ----");
//            ArrayList<Alumno> listaAlumnos = controladoraLogica.traerListasAlumnos();
//            for(Alumno al : listaAlumnos){
//                System.out.println("El alumno es: " + al.toString());
//            }
//            System.out.println("---------------------------------");
            
//        U-date ------------------------
//          Alumno alu = new Alumno(30,"Luisina","Jpa", new Date());
//          controladoraLogica.crearAlumno(alu);
//          alu.setApellido("de Paula");
//          controladoraLogica.editarAlumno(alu);
        
//        D-elete -----------------------
//          controladoraLogica.eliminarAlumno(30);
    }
}
