package br.lab.www;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class OrderController {

    @GetMapping
    public String index() {
        return "index";
    }
}
