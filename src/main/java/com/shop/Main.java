package com.shop;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ParfumShop shop = new ParfumShop();

        // Исходные данные (имитация корзины клиента)
        List<Double> basePrices = Arrays.asList(125.0, 89.0, 50.0);  // цены на разные ароматы
        List<Double> margins = Arrays.asList(0.25, 0.20, 0.15);      // прибыль магазина
        int clientPurchasesHistory = 12;                             // клиент уже покупал 12 раз

        // Проверка, является ли клиент премиум
        boolean isPremium = shop.isPremiumClient(clientPurchasesHistory);

        // Расчёт итоговой цены
        double finalPrice = shop.totalPriceForCart(basePrices, margins, isPremium);

        // Расчёт бонусных баллов
        int bonusPoints = shop.calculateBonusPoints(finalPrice);

        // Вывод результатов
        System.out.println("====== Parfum Shop Sales System ======");
        System.out.println("История покупок клиента: " + clientPurchasesHistory);
        System.out.println("Премиум клиент: " + (isPremium ? "Да" : "Нет"));
        System.out.println("-------------------------------------");
        System.out.println("Состав корзины (цена товара / маржа):");
        for (int i = 0; i < basePrices.size(); i++) {
            System.out.printf("Товар %d: %.2f руб. / маржа %.0f%%\n",
                    i + 1, basePrices.get(i), margins.get(i) * 100);
        }
        System.out.println("-------------------------------------");
        System.out.printf("Итоговая стоимость: %.2f руб.\n", finalPrice);
        System.out.println("Начислено бонусных баллов: " + bonusPoints);
        System.out.println("=====================================");
    }
}
