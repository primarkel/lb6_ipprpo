package com.shop;
//п
import org.junit.jupiter.api.Test;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class ParfumShopTest {

    @Test
    public void testCalculatePrice() {
        ParfumShop shop = new ParfumShop();
        assertEquals(120, shop.calculatePrice(100, 0.2), 0.01);
    }

    @Test
    public void testIsPremiumClient() {
        ParfumShop shop = new ParfumShop();
        assertTrue(shop.isPremiumClient(15));
        assertFalse(shop.isPremiumClient(5));
    }

    @Test
    public void testDiscountForPremium() {
        ParfumShop shop = new ParfumShop();
        assertEquals(90, shop.discountForPremium(true, 100), 0.01);
        assertEquals(100, shop.discountForPremium(false, 100), 0.01);
    }

    @Test
    public void testTotalPriceForCart() {
        ParfumShop shop = new ParfumShop();

        List<Double> prices = Arrays.asList(100.0, 50.0, 30.0);
        List<Double> margins = Arrays.asList(0.2, 0.15, 0.1);

        double result = shop.totalPriceForCart(prices, margins, true);

        // с маржой: 120 + 57.5 + 33 = 210.5
        // премиум -10% на каждый товар → 189.45
        assertEquals(189.45, result, 0.01);
    }

    @Test
    public void testBonusPoints() {
        ParfumShop shop = new ParfumShop();
        assertEquals(3, shop.calculateBonusPoints(160));  // 160 / 50 = 3
        assertEquals(0, shop.calculateBonusPoints(40));   // 40 / 50 = 0
    }
}
