package br.lab.application.Order;

import br.lab.application.Order.command.NewOrderCommand;
import br.lab.domain.model.Order.Order;
import br.lab.domain.port.OrderRepository;

public class OrderApplicationService {

    private OrderRepository orderRepository;

    public OrderApplicationService(OrderRepository aOrderRepository) {
        this.orderRepository = aOrderRepository;
    }

    public void gerarNovaOrderm(NewOrderCommand command){
        var order = new Order(command);

        orderRepository.add(order);
    }
}
