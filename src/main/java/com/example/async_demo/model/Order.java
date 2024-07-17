package com.example.async_demo.model;
import lombok.Data;

import java.util.List;

@Data
public class Order {

    private Long id;
    private String customerName;
    private String customerEmail;
    private List<Item> items;
    private double totalPrice;
}
