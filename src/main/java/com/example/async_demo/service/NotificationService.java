package com.example.async_demo.service;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {

    @Async
    public CompletableFuture<Void> notifyRestaurantAndDelivery(Order order) {
        // Simulated delay for notification (replace with actual logic)
        try {
            Thread.sleep(3000); // Simulate 3 seconds delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Restaurant and delivery notified about order: " + order.getId());
        return CompletableFuture.completedFuture(null);
    }
}
