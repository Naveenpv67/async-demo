package com.example.async_demo.service;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.async_demo.model.Order;

@Service
public class InventoryService {

    @Async
    public CompletableFuture<Void> updateInventory(Order order) {
        // Simulated delay for updating inventory (replace with actual logic)
        try {
            Thread.sleep(1500); // Simulate 1.5 seconds delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Inventory updated for order: " + order.getId());
        return CompletableFuture.completedFuture(null);
    }
}
