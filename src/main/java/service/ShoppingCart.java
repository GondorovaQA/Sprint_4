package service;

import model.Food;
import model.Discountable;

public class ShoppingCart {
    private Food[] items;

    public ShoppingCart(Food[] items) {
        this.items = items;
    }

    public double getTotalAmountWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            total += item.getAmount() * item.getPrice();
        }
        return total;
    }

    public double getTotalAmountWithDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item instanceof Discountable) {
                Discountable discountable = (Discountable) item;
                total += item.getAmount() * item.getPrice() * (1 - discountable.getDiscount());
            } else {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }

    public double getTotalVegetarianAmountWithoutDiscount() {
        double total = 0;
        for (Food item : items) {
            if (item.isVegetarian()) {
                total += item.getAmount() * item.getPrice();
            }
        }
        return total;
    }
}



