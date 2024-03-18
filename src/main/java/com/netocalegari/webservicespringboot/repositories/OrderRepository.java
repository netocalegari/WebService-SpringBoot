package com.netocalegari.webservicespringboot.repositories;

import com.netocalegari.webservicespringboot.entities.Order;
import com.netocalegari.webservicespringboot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface OrderRepository extends JpaRepository<Order, Long> {
}
