package com.shop;

public class Product {
    public enum Category { LUXURY, MASS_MARKET, NICHE }

    private String name;
    private double basePrice;
    private Category category;

    public Product(String name, double basePrice, Category category) {
        this.name = name;
        this.basePrice = basePrice;
        this.category = category;
    }

    public String getName() { return name; }
    public double getBasePrice() { return basePrice; }
    public Category getCategory() { return category; }
}
