package com.springboot.Controller;

import com.springboot.Entity.Order1;
import com.springboot.Repository.AddressRepository;
import com.springboot.Repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

    @Autowired
    private AddressRepository addressRepository;
    @Autowired
    private OrderRepository orderRepository;

    @GetMapping("/")
    public String index(){
        return "Welcome Page";
    }
    @GetMapping("/allOrder")
    public List<Order1> getAllOrder(){
        return orderRepository.findAll();
    }
}
