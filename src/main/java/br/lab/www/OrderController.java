package br.lab.www;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/")
public class OrderController {

    @GetMapping("{menssagem}")
    public ResponseEntity index(@PathVariable("menssagem") String aMenssagem ) {
        return  ResponseEntity.ok().body("Hello, World!: " + aMenssagem);
    }
}
