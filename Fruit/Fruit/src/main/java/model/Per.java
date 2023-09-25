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
public class Per {
    protected String name;

    public Per(String name) {
        this.name = name;
    }

    public Per() {
        this.name = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void nameCustomer() {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Enter Name Customer:");
        name = sc.nextLine();
    }

}
