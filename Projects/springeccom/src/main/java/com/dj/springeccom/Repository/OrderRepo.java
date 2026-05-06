package com.dj.springeccom.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dj.springeccom.Model.Order;

import java.util.Optional;


@Repository
public interface OrderRepo extends JpaRepository<Order,Integer>{
    Optional<Order> findByOrderId(String orderId);
}
