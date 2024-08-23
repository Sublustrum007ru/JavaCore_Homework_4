package controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static controller.Products.productList;

class MyCustomExeption extends Exception {
    public MyCustomExeption(String message) {
        super(message);
    }
}

public class Orders {

    public static List<String> createOrders(List<Humans> human, int index) {
        List<String> orderList = new ArrayList<>();
        List<String> tempList = new ArrayList<>();
        try {
            isIndex(index, human);
            int count = new Random().nextInt(1, productList.size());
            for (int i = 0; i < count; i++) {
                tempList.add(productList.get(i).getName());
            }
            orderList.add(human.get(index).getName() + " buy " + tempList);
        } catch (MyCustomExeption e) {
            orderList.add("Ошибка!!! " + e.getMessage());
        }
        return orderList;
    }
    public static List<String> createOrders1(List<Humans> human, int index) {
        List<String> orderList = new ArrayList<>();
        List<String> tempList = new ArrayList<>();
        try {
            isIndex(index, human);
            int count = new Random().nextInt(1, productList.size());
            for (int i = 0; i < count; i++) {
                tempList.add(productList.get(i).getName());
            }
            orderList.add(human.get(index).getName() + " buy: " + tempList);
        } catch (MyCustomExeption e) {
            orderList.add("Ошибка!!! " + e.getMessage());
        }
        return orderList;
    }

    public static void isIndex(int index, List<Humans> human) throws MyCustomExeption {
        if (index < 0 || index >= human.size()) {
            throw new MyCustomExeption("Нет такого покупателя");
        }
    }


}
