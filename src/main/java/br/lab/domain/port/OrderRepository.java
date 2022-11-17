package br.lab.domain.port;

import br.lab.domain.model.Order.Order;

public interface OrderRepository {
    void add(Order order);
}
