package org.example;

import model.Apple;
import model.Meat;
import model.Food;
import service.ShoppingCart;

public class Main {
    public static void main(String[] args) {
        Meat meat = new Meat(5, 100);
        Apple redApple = new Apple(10, 50, "red");
        Apple greenApple = new Apple(8, 60, "green");

        Food[] items = {meat, redApple, greenApple};
        ShoppingCart cart = new ShoppingCart(items);

        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalAmountWithoutDiscount() + " руб.");
        System.out.println("Общая стоимость товаров со скидкой: " + cart.getTotalAmountWithDiscount() + " руб.");
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getTotalVegetarianAmountWithoutDiscount() + " руб.");
    }
}