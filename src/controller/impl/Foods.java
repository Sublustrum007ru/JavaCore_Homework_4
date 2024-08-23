package controller.impl;

import controller.Products;

public class Foods extends Products {
    protected String color;

    public Foods(String name, int weight, String color) {
        super(name, weight);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Weight: %dg, Color: %s", name, weight, color);
    }

}
