package com.app.fruits;
import java.util.Scanner;
public class FruitBasket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Fruit Basket size: ");
        int size = sc.nextInt();
        fruit basket[] = new fruit[size];
        int counter = 0;
        int choices;
        do {
            System.out.println("Fruit Basket");
            System.out.println("0. Exit");
            System.out.println("1. Add Mango ");
            System.out.println("2. Add Orange ");
            System.out.println("3. Add Apple ");
            System.out.println("4. Display names of all fruits in the basket ");
            System.out.println("5. Display name, color, weight, taste of all fresh fruits");
            System.out.println("6. Display tastes of all stale fruits in the basket.");
            System.out.println("7. Mark a fruit as stale ");
            System.out.println("8. Mark all sour fruits stale ");
            System.out.print("Enter your choice: ");
            choices = sc.nextInt();
            switch (choices) {
                case 1: 
                    if (counter < basket.length) {
                        System.out.print("Enter color: ");
                        String color = sc.next();
                        System.out.print("Enter weight: ");
                        double weight = sc.nextDouble();
                        basket[counter++] = new Mango(color, weight);
                        System.out.println("Mango added successfully!");
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;
                case 2:
                    if (counter < basket.length) {
                        System.out.print("Enter colour: ");
                        String color = sc.next();
                        System.out.print("Enter weight: ");
                        double weight = sc.nextDouble();
                        basket[counter++] = new Orange(color, weight);
                        System.out.println("Orange added successfully!");
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;
                case 3: 
                    if (counter < basket.length) {
                        System.out.print("Enter color: ");
                        String color = sc.next();
                        System.out.print("Enter weight: ");
                        double weight = sc.nextDouble();
                        basket[counter++] = new Apple(color, weight);
                        System.out.println("Apple added successfully!");
                    } else {
                        System.out.println("Basket is full!");
                    }
                    break;
                case 4: 
                    System.out.println("Fruit Names");
                    for (fruit f : basket) {
                        if (f != null) {
                            System.out.println(f.getName());
                        }
                    }
                    break;
                case 5: 
                    System.out.println("Fresh Fruits");
                    for (fruit f : basket) {
                        if (f != null && f.isFresh()) {
                            System.out.println(f);
                        }
                    }
                    break;
                case 6: 
                    System.out.println("Stale Fruits");
                    for (fruit f : basket) {
                        if (f != null && !f.isFresh()) {
                            System.out.println("Name: " + f.getName() + ", Taste: " + f.taste());
                        }
                    }
                    break;
                case 7:
                    System.out.print("Enter fruit index (0 to " + (basket.length - 1) + "): ");
                    int index = sc.nextInt();

                    if (index >= 0 && index < basket.length && basket[index] != null) {
                        basket[index].setFresh(false);
                        System.out.println(basket[index].getName() + " marked as stale.");
                    } else {
                        System.out.println("Invalid index or no fruit exists at this position.");
                    }
                    break;
                case 8: 
                    boolean foundSour = false;
                    for (fruit f : basket) {
                        if (f != null && f.taste().equalsIgnoreCase("sour")) {
                            f.setFresh(false);
                            foundSour = true;
                        }
                    }
                    if (foundSour) {
                        System.out.println("All sour fruits marked as stale.");
                    } else {
                        System.out.println("No sour fruits found in the basket.");
                    }
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        } while (choices != 0);
    }
}
