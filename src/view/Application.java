package view;

import controller.*;

import static controller.Humans.buyerList;
import static controller.Humans.emplList;
import static controller.Products.productList;

import controller.impl.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class Application {

    private static final Products product = new Products();
    private static final Humans human = new Humans();
    private static final Orders order = new Orders();
    private static final ArrayList<List> orderList = new ArrayList<>();
    private static Random random = new Random();
    private static final Date thisDay = new Date();
    private static final SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yyy");


    public static void app() {
        System.out.println("Hello world!!!\n");
        run();
    }

    public static void run() {
        Humans humans1 = new Employee("Anton", "Gusev", Gender.MALE, "Employee");
        Humans humans2 = new Buyer("Sergey", "Gusev", Gender.MALE, "Buyer");
        Humans humans3 = new Employee("Alexsander", "Ozerov", Gender.MALE, "Employee");
        Humans humans4 = new Buyer("Nataliya", "Guseva", Gender.FAMALE, "Buyer");
        Humans humans5 = new Employee("Tatyana", "Shanygina", Gender.FAMALE, "Employee");
        Humans humans6 = new Buyer("Alexey", "Kazennov", Gender.MALE, "Buyer");
        Humans humans7 = new Employee("Evgeniy", "Sobolev", Gender.MALE, "Employee");
        Humans humans8 = new Buyer("Ekaterina", "Guseva", Gender.FAMALE, "Buyer");
        Humans humans9 = new Buyer("Varvara", "Guseva", Gender.FAMALE, "Buyer");
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
        int index = 0;
        int count = 0;
        System.out.println("---***---***---***---");
        System.out.println("Create order #1:");
        index = random.nextInt(-10, buyerList.size() + 5);
        count = new Random().nextInt(-10, productList.size());
        runOrders(buyerList, index, count);
        System.out.println("---***---***---***---");
        System.out.println("Create order #2:");
        index = random.nextInt(-10, buyerList.size() + 5);
        count = new Random().nextInt(-10, productList.size());
        runOrders(buyerList, index, count);
        System.out.println("---***---***---***---");
        System.out.println("Create order #3:");
        index = random.nextInt(-10, buyerList.size() + 5);
        count = new Random().nextInt(-10, productList.size());
        runOrders(buyerList, index, count);
        System.out.println("---***---***---***---");
        System.out.println("Create order #4:");
        index = random.nextInt(-10, buyerList.size() + 5);
        count = new Random().nextInt(-10, productList.size());
        runOrders(buyerList, index, count);
        System.out.println("---***---***---***---");
        System.out.println("Create order #5:");
        index = random.nextInt(-10, buyerList.size() + 5);
        count = new Random().nextInt(-10, productList.size());
        runOrders(buyerList, index, count);
        System.out.println("---***---***---***---");
        System.out.println("Create order #6:");
        index = random.nextInt(-10, buyerList.size() + 5);
        count = new Random().nextInt(-10, productList.size());
        runOrders(buyerList, index, count);
        System.out.println("\nList oders: \n");
        printOrderList(orderList);
        System.out.println("\n*************************\n");
        System.out.println("Проверка на праздник");
        checkHolyday();

    }

    public static void runOrders(List<Humans> humanList, int xHuman, int count) {
//        String result = "";
//        result = String.valueOf(order.createOrders(humanList, xHuman, count)).replace("[", "").replace("]", "");
//        System.out.println(result);
        if (!order.createOrders(humanList, xHuman, count).isEmpty()) {
            orderList.add(order.createOrders(humanList, xHuman, count));
        }

    }

    public static void printHumansList(List<Humans> humans) {
        for (Humans human : humans) {
            System.out.println(human);
        }
    }

    public static void printOrderList(List<List> orderList){
        if (!orderList.isEmpty()) {
            for (List x : orderList) {
                System.out.println(x.;);
            }
        }else{
            System.out.println("Лист покупателей сделавших покупки пуст");
        }
    }

    public static void printProductList(List<Products> products) {
        for (Products product : products) {
            System.out.println(product);
        }
    }

    public static void checkHolyday() {
        if (thisDay.getDate() == 8 && thisDay.getMonth() == 2 || thisDay.getDate() == 23 && thisDay.getMonth() == 1 || thisDay.getDate() == 31 && thisDay.getMonth() == 11) {
            for (int i = 0; i < emplList.size(); i++) {
                if (thisDay.getDate() == 8 && thisDay.getMonth() == 2) {
                    if (emplList.get(i).getGender() == Gender.FAMALE) {
                        System.out.println(emplList.get(i).getName() + " Поздравляем Вас с праздником. 8 марта");
                    }
                } else if (thisDay.getDate() == 23 && thisDay.getMonth() == 1) {
                    if (emplList.get(i).getGender() == Gender.FAMALE) {
                        System.out.println(emplList.get(i).getName() + " Поздравляем с праздником. 23 февраля");
                    }
                } else if (thisDay.getDate() == 31 && thisDay.getMonth() == 11) {
                    System.out.println(emplList.get(i).getName() + " Поздравляем Вас с праздником. Новый год!!!");
                }
            }
        } else {

            System.out.println("Сегодня: " + formatter.format(thisDay));
            System.out.println("Сегодня нет праздников");
        }

    }

}

