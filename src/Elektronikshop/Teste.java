package Elektronikshop;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ElektronikShopTest {

    @Test
    public void testCheapKeyboard() {
        ElektronikShop shop = new ElektronikShop();
        int[] list = {30, 40, 20, 10, 50};
        assertEquals(10, shop.cheapKeyboard(list));
    }

    @Test
    public void testCheapKeyboard2(){
        ElektronikShop shop = new ElektronikShop();
        int[] list = {};
        assertEquals(Integer.MAX_VALUE, shop.cheapKeyboard(list));
    }

    @Test
    public void testExpensiveProduct() {
        ElektronikShop shop = new ElektronikShop();
        int[] list1 = {30, 40, 20, 10, 50};
        int[] list2 = {60, 70, 80};
        assertEquals(80, shop.expensiveProduct(list1, list2));
    }

    @Test
    public void testExpensiveProduct2(){
        ElektronikShop shop = new ElektronikShop();
        int[] list1 = {};
        int[] list2 = {};
        assertEquals(Integer.MIN_VALUE, shop.expensiveProduct(list1, list2));
    }

    @Test
    public void testInBudgetUSB() {
        ElektronikShop shop = new ElektronikShop();
        int[] list = {30, 40, 20, 10, 50};
        int budget = 45;
        assertEquals(40, shop.inBudgetUSB(list, budget));
    }

    @Test
    public void testInBudgetUSB2(){
        ElektronikShop shop = new ElektronikShop();
        int[] list = {30, 40, 20, 10, 50};
        int budget = 5;
        assertEquals(-1, shop.inBudgetUSB(list, budget));
    }

    @Test
    public void testReceipt() {
        ElektronikShop shop = new ElektronikShop();
        int[] keyboards = {30, 40, 20};
        int[] USBs = {10, 50};
        int budget = 60;
        assertEquals(50, shop.receipt(keyboards, USBs, budget));
    }

    @Test
    public void testNoAffordableCombination() {
        ElektronikShop shop = new ElektronikShop();
        int[] keyboards = {30, 40, 20};
        int[] USBs = {60, 70};
        int budget = 50;
        assertEquals(-1, shop.receipt(keyboards, USBs, budget));
    }
}