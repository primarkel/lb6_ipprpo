package com.shop;

public class Client {
    private final String name;
    private final int totalPurchases;

    public Client(String name, int totalPurchases) {
        this.name = name;
        this.totalPurchases = totalPurchases;
    }

    public boolean isPremium() {
        return totalPurchases > 10;
    }

    public String getName() { return name; }
}
