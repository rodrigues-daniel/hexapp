package br.lab.www;

import br.lab.application.ApplicationServiceRegistry;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class OrderController {

    @GetMapping("{menssagem}")
    public ResponseEntity index(@PathVariable("menssagem") String aMenssagem ) {
        var app = ApplicationServiceRegistry();



        return  ResponseEntity.ok().body("Hello, World!: " + aMenssagem + "Serviço: " + nome);
    }
}
