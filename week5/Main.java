package week5;

import java.util.Scanner;

class Item {
    int code;
    double price;

    void display() {
        System.out.println("Code: " + code + ", Price: " + price);
    }
}

public class Main {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            Item[] items = new Item[5];
            double totalPrice = 0;

            for (int i = 0; i < 5; i++) {
                items[i] = new Item();
                System.out.print("Enter code for item " + (i + 1) + ": ");
                items[i].code = sc.nextInt();
                System.out.print("Enter price for item " + (i + 1) + ": ");
                items[i].price = sc.nextDouble();
                totalPrice += items[i].price;
            }

            System.out.println("\nItems in Tabular Form:");
            for (int i = 0; i < 5; i++) {
                items[i].display();
            }

            System.out.println("Total Price of all items: " + totalPrice);
        }
    }
}
