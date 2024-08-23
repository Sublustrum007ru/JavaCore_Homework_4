package controller;

import java.util.ArrayList;
import java.util.List;

public class Products{

    public static final List<Products> productList = new ArrayList<>();;
    public static final List<Products> toysList = new ArrayList<>();
    public static final List<Products> foodsList = new ArrayList<>();

    protected String name;
    protected int weight;

    public Products(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }
    public Products(){

    }

    public String getName() {
        return name;
    }

    public int getWeight() {
        return weight;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public void addProductList(Products product) {
        if (product.getClass().getSimpleName().equals("Toys")) {
            toysList.add(product);
            addList(product);
        }else if(product.getClass().getSimpleName().equals("Foods")){
            foodsList.add(product);
            addList(product);
        }
    }
    public void addList(Products product){
        productList.add(product);
    }

    public String toString(){
        return String.format("Name: %s, Weight: %dg", name, weight);
    }
}
