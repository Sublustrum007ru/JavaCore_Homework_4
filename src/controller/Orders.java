package controller;


import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import static controller.Products.productList;

class CustomerException extends Exception {
    public CustomerException(String message) {
        super(message);
    }
}

class ProductException extends Exception {
    public ProductException(String message) {
        super(message);
    }
}

class AmountException extends Exception {
    public AmountException(String message) {
        super(message);
    }
}

public class Orders {

    public static List<String> createOrders(List<Humans> human, int index, int count) {
        List<String> orderList = new ArrayList<>();
        List<String> tempList = new ArrayList<>();
        try {
            checkAll(index, human, productList, count);
            for (int i = 0; i < count; i++) {
                tempList.add(productList.get(i).getName());
            }
            orderList.add(human.get(index).getName() + " buy: " + tempList);
        } catch (CustomerException e) {
            System.out.println("Ошибка!!! " + e.getMessage());
        } catch (AmountException e) {
            System.out.println("Ошибка!!! " + e.getMessage());
        } catch (ProductException e) {
            System.out.println("Ошибка!!! " + e.getMessage());
        }
        return orderList;
    }

    public static void checkAll(int index, List<Humans> human, List<Products> productList, int count) throws CustomerException, ProductException, AmountException {
        if (index < 0 || index >= human.size()) {
            throw new CustomerException("Нет такого покупателя");
        } else if (count <= 0) {
            throw new AmountException("Число продуктов не может быть отрицательным!!");
        } else if (count >= productList.size()) {
            throw new ProductException("Нет такого продукта");
        }
    }


}
