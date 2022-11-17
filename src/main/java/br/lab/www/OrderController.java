package br.lab.www;

import br.lab.application.Order.OrderApplicationService;
import br.lab.application.Order.command.NewOrderCommand;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class OrderController {

    private OrderApplicationService service;

    @GetMapping("/newOrder")
    public void index(@RequestBody String valor) {
        var aNewOrder = new NewOrderCommand(valor);
        service.gerarNovaOrderm(aNewOrder);
    }
}
