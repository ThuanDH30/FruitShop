/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.util.Scanner;
/**
 *
 * @author Bravo
 */
public class Fruit extends Per {
    protected String idF;
    protected String nameF;
    protected double priceF;
    protected String originF;
    protected int quantity;

    public Fruit(String name, String idF, String nameF, double price, String origin, int quantity) {
        super(name);
        this.idF = idF;
        this.nameF = name;
        this.priceF = price;
        this.originF = origin;
        this.quantity = quantity;
    }

    public Fruit() {
        this.idF = null;
        this.nameF = null;
        this.priceF = 0;
        this.originF = null;
        this.quantity = 0;
    }

    public String getIdF() {
        return idF;
    }

    public void setIdF(String idF) {
        this.idF = idF;
    }

    public String getNameF() {
        return nameF;
    }

    public void setNameF(String nameF) {
        this.nameF = nameF;
    }

    public double getPriceF() {
        return priceF;
    }

    public void setPriceF(double priceF) {
        this.priceF = priceF;
    }

    public String getOriginF() {
        return originF;
    }

    public void setOriginF(String originF) {
        this.originF = originF;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getTotalmoney()

    {
        return quantity * priceF;
    }

    public void inputFruit() {
        super.nameCustomer();
        Scanner sc = new Scanner(System.in);
        System.out.println("ID Fruits: ");
        idF = sc.nextLine();
        System.out.println("Name Fruits: ");
        nameF = sc.nextLine();
        System.out.println("price Fruits: ");
        priceF = sc.nextDouble();
        System.out.println("Quantity Fruits: ");
        quantity = sc.nextInt();
        sc.nextLine();
        System.out.println("Original Fruits: ");
        originF = sc.nextLine();
        System.out.println("Total Money: " + getTotalmoney());
        System.out.println("--------------------------------------------------------");

    }

    @Override
    public String toString() {
        double totalMoney = getTotalmoney();
        return " [Name Customer: " + name + " ID Fruit: " + idF + ", Name Fruit: " + nameF + ", Price Fruit: " + priceF
                + ", Origin Fruit: " + originF + ", Quantity: "
                + quantity + " Total Money: " + totalMoney + "]";
    }

}