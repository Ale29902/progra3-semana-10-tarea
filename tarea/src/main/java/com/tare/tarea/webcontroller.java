package com.tare.tarea;
  import org.springframework.stereotype.Controller;
    import org.springframework.web.bind.annotation.GetMapping;
    import org.springframework.web.bind.annotation.RequestMapping;
    
    import jakarta.annotation.Generated;
    
    @Controller
    @RequestMapping("/pagina")
    public class webcontroller {
    
        @GetMapping()
        public String pagina() {
            return "pagina";
        }
    
        
    } 
