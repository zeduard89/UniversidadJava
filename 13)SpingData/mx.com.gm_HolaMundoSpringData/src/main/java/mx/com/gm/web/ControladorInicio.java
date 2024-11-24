package mx.com.gm.web;

import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import mx.com.gm.domain.Persona;
import mx.com.gm.service.IPersonaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@Slf4j
public class ControladorInicio {
    
    @Autowired //
    private IPersonaService personaService;
    
    @GetMapping("/")
    public String inicio(Model model){
        log.info("ejecutando el controlador Spring MVC");
        var personas = personaService.listarPersonas();
        model.addAttribute("personas", personas);
        
        return "index";
    }
    
    @GetMapping("/agregar")
    public String agregar(Persona persona){ 
        //No es necesario utilizar el operador NEW ya que Spring
        //busca o crea automaticamente el objeto y lo inyecta
        //tambien se comparte en el alcanze de request
        return "modificar";
    }
    
    //Cuando se guarda un objeto desde cerco se genera up "Create"
    //conlleva a que se genere un ID, pero si edito, se genera un
    //"update" por lo cual tengo que especificar si o si el ID, por eso
    //se genero un INPUT-hidden en el formulario para ese caso
    //*Si no es especifica el ID, se intenta crear 1 registro nuevo
    @PostMapping("/guardar")
    public String guardar(@Valid Persona persona, Errors errores){ //Validacion
        if(errores.hasErrors()){
            return "modificar";
        }
        personaService.guardar(persona);
        return "redirect:/";
    }
    
    @GetMapping("/editar/{idPersona}")
    public String editar(Persona persona, Model model){
        //Spring busca el objeto Persona lo inicializa y  
        //lo asocia al Id que recive por query Automaticamente
        persona = personaService.encontrarPersona(persona);
        model.addAttribute("persona", persona);
        return "modificar";
    }
    
    //Obtiene el Id por query params
    @GetMapping("/eliminar")
    public String eliminar(Persona persona){
        personaService.eliminar(persona);
        return "redirect:/";
    }
    
}
