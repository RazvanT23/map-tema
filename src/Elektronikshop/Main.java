package Elektronikshop;

public class Main {
    public static void main(String[] args) {
        int[] priceKeyboard = new int[]{40, 50, 60};
        int[] priceUSB = new int[]{8, 12};
        int budget = 60;
        ElektronikShop customer = new ElektronikShop();
        System.out.println(customer.cheapKeyboard(priceKeyboard));
        System.out.println(customer.expensiveProduct(priceKeyboard, priceUSB));
        System.out.println(customer.inBudgetUSB(priceUSB, budget));
        System.out.println(customer.receipt(priceKeyboard, priceUSB, budget));
    }
}