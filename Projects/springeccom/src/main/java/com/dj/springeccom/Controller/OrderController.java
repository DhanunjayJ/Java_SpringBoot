package com.dj.springeccom.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dj.springeccom.Model.dto.OrderRequest;
import com.dj.springeccom.Model.dto.OrderResponse;
import com.dj.springeccom.Service.OrderService;

@RestController
@RequestMapping("/api")
@CrossOrigin(origins="https://laughing-funicular-5gwjwpp4rgj724r5r-5173.app.github.dev/")
public class OrderController {

    @Autowired
    private OrderService service;

    @PostMapping("/orders/place")
    public ResponseEntity<OrderResponse> placeOrder(@RequestBody OrderRequest orderRequest){
        OrderResponse orderResponse = service.placeOrder(orderRequest);
        return new ResponseEntity<>(orderResponse,HttpStatus.CREATED);
    }

    @GetMapping("/orders")
    public ResponseEntity<List<OrderResponse>> getAllOrders(){
        List<OrderResponse> responses = service.getAllOrderResponses();
        return new ResponseEntity<>(responses,HttpStatus.OK);
    }
}
