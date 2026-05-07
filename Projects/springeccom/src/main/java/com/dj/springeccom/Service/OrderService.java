package com.dj.springeccom.Service;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dj.springeccom.Model.Order;
import com.dj.springeccom.Model.OrderItem;
import com.dj.springeccom.Model.Product;
import com.dj.springeccom.Model.dto.OrderItemRequest;
import com.dj.springeccom.Model.dto.OrderItemResponse;
import com.dj.springeccom.Model.dto.OrderRequest;
import com.dj.springeccom.Model.dto.OrderResponse;
import com.dj.springeccom.Repository.OrderRepo;
import com.dj.springeccom.Repository.ProductRepository;

@Component
public class OrderService {

    @Autowired
    ProductRepository productRepository;

    @Autowired
    OrderRepo orderRepo;

    public OrderResponse placeOrder(OrderRequest request) {
       
        Order order = new Order();
        String orderId = "ORD"+UUID.randomUUID().toString().substring(0,8).toUpperCase();
        order.setOrderId(orderId);
        order.setCustomerName(request.customerName());
        order.setEmail(request.email());
        order.setStatus("PLACED");
        order.setOrderDate(LocalDate.now());

        List<OrderItem> orderItems = new ArrayList<>();

        for(OrderItemRequest item : request.items()){
            Product product = productRepository.findById(item.productId())
                              .orElseThrow(() -> new RuntimeException("Product Not Found"));

            product.setStockQuantity(product.getStockQuantity()-item.quantity());
            productRepository.save(product);

            OrderItem orderItem = OrderItem.builder()
                        .product(product)
                        .quantity(item.quantity())
                        .totalPrice(product.getPrice().multiply(BigDecimal.valueOf(item.quantity())))
                        .order(order)
                        .build();
            
            orderItems.add(orderItem);
        }

        order.setOrderItems(orderItems);
        Order savedOrder = orderRepo.save(order);

        List<OrderItemResponse> itemResponses = new ArrayList<>();

        for(OrderItem item:order.getOrderItems()){
            OrderItemResponse orderItemResponse = new OrderItemResponse(
                item.getProduct().getName(),
                item.getQuantity(),
                item.getTotalPrice()
            );
            itemResponses.add(orderItemResponse);
        }

        OrderResponse orderResponse = new OrderResponse (
            savedOrder.getOrderId(),
            savedOrder.getCustomerName(),
            savedOrder.getEmail(),
            savedOrder.getStatus(),
            savedOrder.getOrderDate(),
            itemResponses
        );

        return orderResponse;
    }

    public List<OrderResponse> getAllOrderResponses() {
       
       List<Order> orders = orderRepo.findAll();
       List<OrderResponse> orderResponses = new ArrayList<>();

       for(Order order:orders){

        List<OrderItemResponse> orderItemResponses = new ArrayList<>();
        
        for(OrderItem orderitem : order.getOrderItems()){
            OrderItemResponse orderItemResponse = new OrderItemResponse(
                orderitem.getProduct().getName(),
                orderitem.getQuantity(),
                orderitem.getTotalPrice()
            );
            orderItemResponses.add(orderItemResponse);
        }

        OrderResponse orderResponse = new OrderResponse(
            order.getOrderId(),
            order.getCustomerName(),
            order.getEmail(),
            order.getStatus(),
            order.getOrderDate(),
            orderItemResponses
        );

        orderResponses.add(orderResponse);

       }

       return orderResponses;
    }

}
 