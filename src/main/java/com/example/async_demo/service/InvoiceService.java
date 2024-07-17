package com.example.async_demo.service;
import java.util.concurrent.CompletableFuture;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

@Service
public class InvoiceService {

    @Async
    public CompletableFuture<Void> generateInvoice(Order order) {
        // Simulated delay for generating invoice (replace with actual logic)
        try {
            Thread.sleep(2500); // Simulate 2.5 seconds delay
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
        }
        System.out.println("Invoice generated for order: " + order.getId());
        return CompletableFuture.completedFuture(null);
    }
}
