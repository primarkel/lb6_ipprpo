package com.shop;

import java.util.List;

public class ParfumShop {

    // Рассчитать цену с учетом маржи
    public double calculatePrice(double basePrice, double margin) {
        return basePrice + (basePrice * margin);
    }

    // Проверка, является ли клиент премиум
    public boolean isPremiumClient(int purchases) {
        return purchases > 10;
    }

    // Скидка премиум-клиенту (10%)
    public double discountForPremium(boolean isPremium, double price) {
        return isPremium ? price * 0.9 : price;
    }

    // Итоговая цена корзины
    public double totalPriceForCart(List<Double> basePrices,
                                    List<Double> margins,
                                    boolean isPremiumClient) {
        double total = 0.0;
        for (int i = 0; i < basePrices.size(); i++) {
            double priceWithMargin = calculatePrice(basePrices.get(i), margins.get(i));
            priceWithMargin = discountForPremium(isPremiumClient, priceWithMargin); // скидка на каждый товар
            total += priceWithMargin;
        }
        return total;
    }

    // Дополнительно — расчет бонусных баллов (выдумка "для пыли в глаза")
    public int calculateBonusPoints(double totalPrice) {
        return (int) (totalPrice / 50); // 1 балл за каждые 50 рублей
    }
}
