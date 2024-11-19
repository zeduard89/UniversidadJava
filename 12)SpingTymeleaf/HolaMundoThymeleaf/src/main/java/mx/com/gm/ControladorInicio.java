package mx.com.gm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    // obtener valores desde el archivo "Propiedades"
    @Value("${index.saludo}")
    private String saludo;
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("ejecutando el controlador Spring MVC");
        
        var mensaje = "Hola mundo con Thymeleaf 3";
        
        var persona = new Persona();
        persona.setNombre("Juan");
        persona.setApellido("Perez");
        persona.setEmail("jperez@mail.com");
        persona.setTelefono("1122334455");
        
        var persona2 = new Persona();
        persona2.setNombre("Karla");
        persona2.setApellido("Gomez");
        persona2.setEmail("kGomez@mail.com");
        persona2.setTelefono("332255555455");
        
        //List<Persona> personas = new ArrayList();
        var personas = Arrays.asList(persona,persona2);
        //var personas = new ArrayList();
        
        model.addAttribute("mensaje",mensaje);
        model.addAttribute("saludo",saludo);
        //model.addAttribute("persona",persona);
        
        model.addAttribute("personas", personas);
        return "index";
    }
}
