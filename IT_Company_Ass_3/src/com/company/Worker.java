package com.company;

public class Worker {
    private int price;
    private int level;
    private int number;
    private String name;
    private String firstName;
    private String lastName;

    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return name;
    }
    public int getLevel(){
        return level;
    }
    public int getNumber(){
        return number;
    }
    public int getPrice(){
        return price;
    }

    public void setFirstName(String firstName){this.firstName = firstName;}
    public void setLastName(String lastName){this.lastName = lastName;}
    public void setName(String name){
        this.name = name;
    }
    public void setLevel(int level){
        this.level = level;
    }
    public void setNumber(int number){
        this.number = number;
    }
    public void setPrice(int price){
        this.price = price;
    }
//    public void WorkerAdd(int level, int number, int price){
//        this.level = level;
//        this.number = number;
//        this.price = price;
//    }
}