package ru.job4j.pojo;

import java.util.Arrays;

import static java.util.Arrays.copyOf;

public class Shop {
    public static void main(String[] args) {
        Product[] products = new Product[3];
        products[0] = new Product("milk", 15);
        products[1] = new Product("bread", 10);
        products[2] = new Product("egg", 4);
        Shop shop = new Shop();
        Product[] result = shop.delete(products, 0);

        System.out.println("Продукты до удаления продукта по индексу");
        for (int i = 0; i < products.length; i++) {
            Product product = products[i];
            System.out.println(product.getName());
        }

        System.out.println("Продукты после удаления продукта по индексу");
        for (int i = 0; i < result.length; i++) {
            Product product = result[i];
            System.out.println(product == null ? null : product.getName());
        }
    }

    public Product[] delete(Product[] products, int index) {
        Product[] copy = copyOf(products, products.length);
        copy[index] = null;
        for (int i = index; i < copy.length; i++) {
            if (copy[i] == null && i != copy.length - 1) {
                Product tmp = copy[i + 1];
                copy[i + 1] = copy[i];
                copy[i] = tmp;
            }
        }
        return copy;
    }
}
