package com.example.async_demo.service;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.async_demo.model.Order;

@Service
public class EmailService {

    @Async
    public CompletableFuture<Void> sendOrderConfirmation(Order order) {
        // Simulated delay for sending email (replace with actual logic)
        try {
            Thread.sleep(2000); // Simulate 2 seconds delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Order confirmation email sent to: " + order.getCustomerEmail());
        return CompletableFuture.completedFuture(null);
    }
}
