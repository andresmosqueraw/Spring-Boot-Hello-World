package com.uniempresarial.helloworld;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
// @RequestMapping("/saludar")
public class HolaMundoController {

    //@GetMapping("/hola")
    @RequestMapping("/saludar")
    public String Saludar() {
        return "Hola Mundo";
    }
}
