package com.company;

public class Person {
    private String name;
    private int roll;

    public Person(String name, int roll){
        this.name = name;
        this.roll = roll;
    }

    public String toString(){
        return "name : "+this.name+"\nRoll no. : "+this.roll;
    }
}
