package com.driver;

public class Main {
    public static void main(String[] args){
        RWOnly rwOnly = new RWOnly();
//      rwOnly.name = "Rohan";
        //name variable is private

        rwOnly.setName("Rohan");
        System.out.println(rwOnly.getName());
    }
}