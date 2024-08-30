package controller;

import java.util.ArrayList;

public class Humans {
    protected String name;
    protected String lastName;
    protected Gender gender;
    protected String status;

    public static final ArrayList<Humans> emplList = new ArrayList<Humans>();
    public static final ArrayList<Humans> buyerList = new ArrayList<Humans>();

    public Humans(String name, String lastName, Gender gender, String status) {
        this.name = name;
        this.lastName = lastName;
        this.gender = gender;
        this.status = status;
    }
    public Humans(){

    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public Gender getGender() {
        return gender;
    }

    public String getStatus() {
        return status;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void addHumansList(Humans humans) {
        if (humans.getStatus().equals("Employee")) {
            emplList.add(humans);
        } else if (humans.getStatus().equals("Buyer")) {
            buyerList.add(humans);
        }
    }

    public String toString() {
        return String.format("Name: %s, LastName: %s, Gender: %s",name, lastName, gender);
    }


    //    public String toString(){
//        return "Status: " + status + '\n' +
//                "Name: " + name + '\n' +
//                "LastName: " + lastName + '\n' +
//                "Gender: " + gender + '\n';
//    }
} 

