package com.netocalegari.webservicespringboot.repositories;

import com.netocalegari.webservicespringboot.entities.OrderItem;
import com.netocalegari.webservicespringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {
}
