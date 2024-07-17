package com.example.async_demo.service;
import java.util.concurrent.CompletableFuture;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import com.example.async_demo.model.Order;

@Service
public class OrderService {

    @Autowired
    private EmailService emailService;

    @Autowired
    private NotificationService notificationService;

    @Autowired
    private InventoryService inventoryService;

    @Autowired
    private InvoiceService invoiceService;

    @Autowired
    private LoggingService loggingService;

    // Synchronous order processing
    public void processOrderSync(Order order) {
        // Perform synchronous operations
        saveOrderDetails(order);

        // Perform sequential tasks
        emailService.sendOrderConfirmation(order);
        notificationService.notifyRestaurantAndDelivery(order);
        inventoryService.updateInventory(order);
        invoiceService.generateInvoice(order);
        loggingService.logOrderEvent(order);
    }

    // Asynchronous order processing
    @Async
    public CompletableFuture<Void> processOrderAsync(Order order) {
        // Perform synchronous operations
        saveOrderDetails(order);

        // Perform asynchronous tasks using CompletableFuture
        CompletableFuture<Void> emailFuture = emailService.sendOrderConfirmation(order);
        CompletableFuture<Void> notifyFuture = notificationService.notifyRestaurantAndDelivery(order);
        CompletableFuture<Void> inventoryFuture = inventoryService.updateInventory(order);
        CompletableFuture<Void> invoiceFuture = invoiceService.generateInvoice(order);
        CompletableFuture<Void> logFuture = loggingService.logOrderEvent(order);

        // Wait for all CompletableFuture tasks to complete
        return CompletableFuture.allOf(emailFuture, notifyFuture, inventoryFuture, invoiceFuture, logFuture);
    }

    private void saveOrderDetails(Order order) {
        // Logic to save order details in the database
    }
}
