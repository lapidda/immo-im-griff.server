package deverr.de.immo_server;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BasicController {

    @GetMapping("/")
    public String basicResponse(){
        return "It works.";
    }
}
