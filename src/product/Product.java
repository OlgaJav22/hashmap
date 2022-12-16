package product;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Product {
    private String name;
    private double price;
    private double totalKg;

    double count;
    private List<Product> products = new ArrayList<>();

    public Product(String name, double price, double count, double totalKg) {
        if (name != null && !name.isEmpty() && !name.isBlank()) {
            this.name = name;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        if (price > 0) {
            this.price = price;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }
        if (totalKg > 0) {
            this.totalKg = totalKg;
        } else {
            throw new RuntimeException("Заполните карточку товара полностью");
        }

    }

    public void addProduct(Product name) {
        if (equals(name)) {
            throw new RuntimeException("Этот продукт уже есть в списке");
        } else {
            products.add(name);
        }
    }

    public String getName() {
        return name;
    }

    public double getCount() {
        if (count == 0.0) {
            return count = 1.0;
        } else {
            return count;
        }
    }

    public void setCount(double count) {
        this.count = count;
    }

    public double getPrice() {
        return price;
    }

    public double setPrice(double price) {
        return this.price = price;
    }

    public double getTotalKg() {
        return totalKg;
    }

    public void setTotalKg(double totalKg) {
        this.totalKg = totalKg;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(name, product.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name);
    }

    @Override
    public String toString() {
        return getName() + ", " + price + " руб., " + totalKg + " кг.";
    }
}


