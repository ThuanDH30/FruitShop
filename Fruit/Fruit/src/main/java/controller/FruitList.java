/*
     * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
     * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import model.Fruit;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author Bravo
 */
public class FruitList extends Fruit {

    private ArrayList<Fruit> fruits = new ArrayList<Fruit>();
    private Hashtable<String, ArrayList<Fruit>> orders = new Hashtable<>();
    private Scanner sc = new Scanner(System.in);
    private String customerName;
    private ArrayList<Fruit> selectedItems = new ArrayList<>();
    
    public FruitList(ArrayList<Fruit> fruits) {
        this.fruits = fruits;
    }

    public void createFruit() {

        Fruit fruit = new Fruit(null, idF, nameF, priceF, originF, quantity);
        {
            fruits.add(fruit);
            fruit.inputFruit();
        }
        System.out.println("Do you want to continue creating fruit? (Y/N)");
        String choice = sc.nextLine();
        if (choice.equalsIgnoreCase("Y")) {
            createFruit();
        } else {
            System.out.println("add Fruit sucessfull!!!");
        }
    }

    public void viewOder() {
        for (String customer : orders.keySet()) {
            System.out.println("Customer Name: " + customer);
            System.out.println("  Orders List: ");
            System.out.println("Product | Quantity | Price | Amount");
            System.out.println("----------------------------------");

            ArrayList<Fruit> customerOrder = orders.get(customer);
             double totalCost = 0.0;
            for (Fruit fruit : customerOrder) {
                System.out.printf("%-4s | %-10s | %-8.2f | %-6.2f %n",
                        fruit.getNameF(), fruit.getQuantity(), fruit.getPriceF(), fruit.getTotalmoney());
                totalCost += fruit.getTotalmoney();
                System.out.println("Total Money: "+totalCost);
            }
        }
    }

    public void shopping() {
        System.out.println("SHOPPING: ");
        System.out.println("Enter your name: ");
        customerName = sc.nextLine();

        ArrayList<Fruit> shoppingCart = new ArrayList<>();
        int itemCount = 1;
        System.out.println("| ++ Item ++ | ++ Fruit Name ++ | ++ Origin ++ | ++ Price ++ |");
        for (Fruit fruit : fruits) {
            String formattedString = String.format("| %-10s | %-15s | %-10s | %-10s |",
                    itemCount,
                    fruit.getNameF(),
                    fruit.getOriginF(),
                    fruit.getPriceF());
            System.out.println(formattedString);
            itemCount++;
        }

        while (true) {
            System.out.println("Enter the ID of the fruit to add to your cart (or type 'done' to finish shopping): ");
            String fruitId = sc.nextLine();

            if (fruitId.equalsIgnoreCase("done")) {
                break;
            }
            Fruit selectedFruit = null;
            for (Fruit fruit : fruits) {
                if (fruit.getIdF().equals(fruitId)) {
                    selectedFruit = fruit;
                    break;
                }
            }
            if (selectedFruit != null) {
                shoppingCart.add(selectedFruit);
                selectedItems.add(selectedFruit);

                if (orders.containsKey(customerName)) {
                    orders.get(customerName).add(selectedFruit);
                } else {
                    ArrayList<Fruit> customerOrder = new ArrayList<>();
                    customerOrder.add(selectedFruit);
                    orders.put(customerName, customerOrder);
                }

                System.out.println(selectedFruit.getNameF() + " added to your cart.");
            } else {
                System.out.println("Invalid fruit ID. Please try again.");
            }
        }
        System.out.println("Order placed successfully!");
    }
}
