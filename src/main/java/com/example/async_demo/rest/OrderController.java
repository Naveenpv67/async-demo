package com.example.async_demo.rest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Endpoint for synchronous order processing
    @PostMapping("/sync")
    public String placeOrderSync(@RequestBody Order order) {
        orderService.processOrderSync(order);
        return "Order placed synchronously";
    }

    // Endpoint for asynchronous order processing
    @PostMapping("/async")
    public String placeOrderAsync(@RequestBody Order order) {
        orderService.processOrderAsync(order);
        return "Order placed asynchronously";
    }
}
