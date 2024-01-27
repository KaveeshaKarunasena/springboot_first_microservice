package com.microservicesprintboot.orderservice.controller;

import com.microservicesprintboot.orderservice.dto.OrderRequest;
import com.microservicesprintboot.orderservice.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/order")
@RequiredArgsConstructor
public class OrderController {

    private final OrderService orderService;
    @PostMapping("/place")
    @ResponseStatus(HttpStatus.CREATED)
    public String placeOrder( @RequestBody OrderRequest orderRequest){
        orderService.placeOrder(orderRequest);
        return "Order Placed Successfully";
    }


}
