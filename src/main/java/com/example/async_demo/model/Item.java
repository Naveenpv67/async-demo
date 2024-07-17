package com.example.async_demo.model;
import lombok.Data;

@Data
public class Item {

    private Long id;
    private String name;
    private double price;
    private int quantity; // Assuming quantity for each item in the order
}
