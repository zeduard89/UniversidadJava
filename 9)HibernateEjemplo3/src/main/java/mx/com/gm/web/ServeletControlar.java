package mx.com.gm.web;

import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Persona;
import mx.com.gm.servicio.ServicioPersonas;

@WebServlet("/ServletControlador")
public class ServeletControlar extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response){
        ServicioPersonas servicioPersonas = new ServicioPersonas();
        
        List<Persona> personas = servicioPersonas.listarPersonas();
        request.setAttribute("personas", personas);
        
        try{
        request.getRequestDispatcher("/WEB-INF/listado.jsp").forward(request,response);
        }catch(ServletException ex){
            ex.printStackTrace();
        }catch(IOException ex){
            ex.printStackTrace(System.out);
        }
    }
}
