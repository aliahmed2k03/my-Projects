package com.classes;

public class Vehicle {
    public void drive(){
        System.out.println("vroom vroom");
    }
}

class Car extends Vehicle{
    @Override
    public void drive() {
        System.out.print("Repairing a car");
    }
}
