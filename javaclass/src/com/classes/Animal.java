package com.classes;

public class Animal {
    public void makeSound(){
        System.out.println("this animal makes a sound");
    }
}
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Bark");
    }
}
