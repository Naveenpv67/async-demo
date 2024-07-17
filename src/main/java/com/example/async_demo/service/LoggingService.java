package com.example.async_demo.service;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class LoggingService {

    @Async
    public CompletableFuture<Void> logOrderEvent(Order order) {
        // Simulated delay for logging event (replace with actual logic)
        try {
            Thread.sleep(1000); // Simulate 1 second delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Order event logged for order: " + order.getId());
        return CompletableFuture.completedFuture(null);
    }
}
