package com.rafaelfelix.web_services.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rafaelfelix.web_services.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long>{

}
