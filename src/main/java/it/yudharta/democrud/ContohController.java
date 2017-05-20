package it.yudharta.democrud;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContohController {
    
    @RequestMapping("/halo")
    public String hallo(){
        return "spring framework";
    }
    @RequestMapping("/")
    public String home() {
        return "ini adalah Beranda";
    }   
    
}
