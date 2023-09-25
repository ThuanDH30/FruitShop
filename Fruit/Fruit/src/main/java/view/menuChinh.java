/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package view;

import controller.FruitList;
import java.util.ArrayList;
import java.util.Scanner;
import model.Fruit;

/**
 *
 * @author Bravo
 */
public class menuChinh {

    public void displayMenu() {
        ArrayList<Fruit> fruits = new ArrayList<>();
        FruitList view = new FruitList(fruits);
        String[] options = {"Create a new fruit", "View Order", "Shopping", "Exit"};
        Menu menu = new Menu("Fruit Shop MANAGEMENT SYSTEM", options) {
            @Override
            public void execute(int choice) {
                switch (choice) {
                    case 1:
                        view.createFruit();
                        break;
                    case 2:
                        view.viewOder();
                        break;
                    case 3:
                        view.shopping();
                        break;
                    case 4:
                        System.out.println("Exit");
                        break;
                }
            }
        };
        menu.run();
    }
}
