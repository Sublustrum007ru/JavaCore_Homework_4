package view;

import controller.Humans;

import static controller.Humans.buyerList;

import controller.Products;

import controller.impl.*;
import controller.Orders;

import java.util.List;
import java.util.Random;

public class Application {

    private static final Products product = new Products();
    private static final Humans human = new Humans();
    private static final Orders order = new Orders();
    private static Random random = new Random();

    public static void app() {
        System.out.println("Hello world!!!\n");
        run();
    }

    public static void run() {
        Humans humans1 = new Employee("Anton", "Gusev", Gender.male, "Employee");
        Humans humans2 = new Buyer("Sergey", "Gusev", Gender.male, "Buyer");
        Humans humans3 = new Employee("Alexsander", "Ozerov", Gender.male, "Employee");
        Humans humans4 = new Buyer("Nataliya", "Guseva", Gender.female, "Buyer");
        Humans humans5 = new Employee("Tatyana", "Shanygina", Gender.female, "Employee");
        Humans humans6 = new Buyer("Alexey", "Kazennov", Gender.male, "Buyer");
        Humans humans7 = new Employee("Evgeniy", "Sobolev", Gender.male, "Employee");
        Humans humans8 = new Buyer("Ekaterina", "Guseva", Gender.female, "Buyer");
        Humans humans9 = new Buyer("Varvara", "Guseva", Gender.male , "Buyer");
        human.addHumansList(humans1);
        human.addHumansList(humans2);
        human.addHumansList(humans3);
        human.addHumansList(humans4);
        human.addHumansList(humans5);
        human.addHumansList(humans6);
        human.addHumansList(humans7);
        human.addHumansList(humans8);
        human.addHumansList(humans9);
        Products products1 = new Toys("Car", 50, "10cm*20cm*10cm");
        Products products2 = new Toys("Bear", 150, "25cm*8cm*8cm");
        Products products3 = new Toys("Cat", 50, "15cm*10cm*15cm");
        Products products4 = new Toys("Bear Taddy", 220, "30cm*15cm*12cm");
        Products products5 = new Toys("Dog", 50, "17cm*12cm*16cm");
        Products products6 = new Foods("Apple", 10, "Red");
        Products products7 = new Foods("Apple", 12, "Green");
        Products products8 = new Foods("Apple", 10, "Red");
        Products products9 = new Foods("Apple", 11, "Red");
        Products products10 = new Foods("Orange", 20, "Orange");
        Products products11 = new Foods("Banana", 15, "Yellow");
        product.addProductList(products1);
        product.addProductList(products2);
        product.addProductList(products3);
        product.addProductList(products4);
        product.addProductList(products5);
        product.addProductList(products6);
        product.addProductList(products7);
        product.addProductList(products8);
        product.addProductList(products9);
        product.addProductList(products10);
        product.addProductList(products11);
//        System.out.println("---***---***---***---");
//        System.out.println("List Employee:");
//        printHumansList(emplList);
        System.out.println("---***---***---***---");
        System.out.println("List Buyer:");
        printHumansList(buyerList);
//        System.out.println("---***---***---***---");
//        System.out.println("List Toys:");
//        printProductList(toysList);
//        System.out.println("---***---***---***---");
//        System.out.println("List Foods:");
//        printProductList(foodsList);
        System.out.println("---***---***---***---");
        System.out.println("Create order:");
        int index = random.nextInt(0, buyerList.size());
        runOrders(buyerList, index);

    }

    public static void runOrders(List<Humans> humanList, int xHuman) {
        String result = "";
        result = String.valueOf(order.createOrders1(humanList, xHuman)).replace("[", "").replace("]", "");
        System.out.println(result);

    }

    public static void printHumansList(List<Humans> humans) {
        for (Humans human : humans) {
            System.out.println(human);
        }
    }

    public static void printProductList(List<Products> products) {
        for (Products product : products) {
            System.out.println(product);
        }
    }
} 
