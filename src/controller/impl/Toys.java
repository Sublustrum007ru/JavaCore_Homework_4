package controller.impl;

import controller.Products;

public class Toys extends Products {
    protected String dimensions;
    public Toys(String name, int weight, String dimensions) {
        super(name, weight);
        this.dimensions = dimensions;
    }

    public String getDimensions(){
        return dimensions;
    }
    public void setDimensions(String dimensions){
        this.dimensions = dimensions;
    }

    @Override
    public String toString(){
        return String.format("Name: %s, Weight: %dg, Dimensions: %s", name, weight, dimensions);
    }
}
