package com.company;

public class Main {
    public static void main(String[] args) {

        car newcar = new car();

        newcar.name="ferrari";
        newcar.color="white";
        newcar.doors=4;
        newcar.engineCapacity="60000cc";

        System.out.println(newcar.color);
    }
}
