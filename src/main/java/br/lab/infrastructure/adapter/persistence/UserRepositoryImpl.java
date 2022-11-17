package br.lab.infrastructure.adapter.persistence;

import br.lab.domain.model.Order.Order;
import br.lab.domain.port.OrderRepository;

public class UserRepositoryImpl implements OrderRepository {

    @Override
    public void add(Order order) {
        // salva no banco
    }
}
