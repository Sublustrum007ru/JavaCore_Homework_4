package controller.impl;

import controller.Gender;
import controller.Humans;

public class Employee extends Humans {
    public Employee(String name, String lastName, Gender gender, String status) {
        super(name, lastName, gender, status);
    }

    public Gender getGender(){return gender;}

}

