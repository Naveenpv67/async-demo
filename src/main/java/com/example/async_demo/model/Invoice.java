package com.example.async_demo.model;
import lombok.Data;

import java.time.LocalDateTime;

@Data
public class Invoice {

    private Long id;
    private Long orderId;
    private double amount;
    private LocalDateTime generatedAt;
    // Other invoice details as needed
}
