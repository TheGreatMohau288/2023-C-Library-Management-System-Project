/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.storesystem;

/**
 *
 * @author Mohau Mokoena
 */
public class Store {
    
    private String name;
    private String address;
    private int inventory;
    
    public Store(){
        this.name = "Royal Mercy Institute";
        this.address = "2002, Johannesburg, Gauteng";
        this.inventory = 10;
    }

    public Store(String name, String address, int inventory) {
        this.name = name;
        this.address = address;
        this.inventory = inventory;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getInventory() {
        return inventory;
    }

    public void setInventory(int inventory) {
        this.inventory = inventory;
    }

    @Override
    public String toString() {
        return "Store{" + "name=" + name + ", address=" + address + ", inventory=" + inventory + '}';
    }
    
    
}


    

