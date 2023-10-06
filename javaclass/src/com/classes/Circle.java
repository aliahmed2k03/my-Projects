package com.classes;

public class Circle {
    private float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    public float calculateArea() {
        return (float) (Math.PI * radius * radius);
    }

    public float calculateCirc() {
        float diameter = radius * 2;
        return (float) (Math.PI*diameter);
    }
}