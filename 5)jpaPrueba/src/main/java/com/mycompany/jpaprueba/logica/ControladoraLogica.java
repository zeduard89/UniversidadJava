package com.mycompany.jpaprueba.logica;
import com.mycompany.jpaprueba.persistencia.ControladoraPersistencia;
import java.util.ArrayList;



//Contiene todos los metodos necesarios para conectar
//con la controladoraPersistencia y q esta se comunique con la DB
//Se realiza mediante un Instancia
public class ControladoraLogica {
    
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    // Void son procedimientos*
    // Puedo recibir el objeto alumno o los campos
    public void crearAlumno(Alumno alu){
        controlPersis.crearAlumno(alu);
    }
    
    public void eliminarAlumno(int id){
        controlPersis.eliminarAlumno(id);
    }
    
    public void editarAlumno(Alumno alu){
        controlPersis.editarAlumno(alu);
    }
    
    // Funcion retorna un valor*
    public Alumno traerAlumno(int id) {
        return controlPersis.traerAlumno(id);
    }

    public ArrayList<Alumno> traerListasAlumnos(){
        return controlPersis.traerListaAlumnos();
    }
    
    
    //CARRERA-----------------------------------
    
    public void crearCarrera(Carrera carre){
        controlPersis.crearCarrera(carre);
    }
    
    public void eliminarCarrera(int id){
        controlPersis.eliminarCarrera(id);
    }
    
    public void editarCarrera(Carrera carre){
        controlPersis.editarCarrera(carre);
    }
    
    
    public Carrera traerCarrera(int id) {
        return controlPersis.traerCarrera(id);
    }

    public ArrayList<Carrera> traerListasCarrera(){
        return controlPersis.traerListaCarrera();
    }
    
    //MATERIA -----------------------------------
    
    public void crearMateria(Materia mate){
        controlPersis.crearMateria(mate);
    }
    
    public void eliminarMateria(int id){
        controlPersis.eliminarMateria(id);
    }
    
    public void editarMateria(Materia mate){
        controlPersis.editarMateria(mate);
    }
    
    
    public Materia traerMateria(int id) {
        return controlPersis.traerMateria(id);
    }

    public ArrayList<Materia> traerListasMateria(){
        return controlPersis.traerListaMateria();
    }
}
