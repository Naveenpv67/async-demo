package com.example.async_demo.model;
import lombok.Data;

@Data
public class InventoryItem {

    private Long id;
    private String name;
    private int quantityAvailable;
    private double price;
    // Other inventory item details as needed
}
