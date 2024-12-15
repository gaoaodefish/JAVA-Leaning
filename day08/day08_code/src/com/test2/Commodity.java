package com.test2;

import java.util.Queue;

public class Commodity {
    String ID;
    String name;
    int price;
    int repertory;

    public Commodity() {
    }

    public Commodity(String ID, String name, int price, int repertory) {
        this.ID = ID;
        this.name = name;
        this.price = price;
        this.repertory = repertory;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRepertory() {
        return repertory;
    }

    public void setRepertory(int repertory) {
        this.repertory = repertory;
    }
}
