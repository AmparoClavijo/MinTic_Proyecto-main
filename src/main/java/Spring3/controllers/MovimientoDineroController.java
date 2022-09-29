package Spring3.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//Url para el usuario
@RestController
public class MovimientoDineroController {


    @GetMapping("/MovimientoDineroList")
    public String MovimientoDineroList(){

        return "Lista de Movimientos de Dinero";
    }
}
