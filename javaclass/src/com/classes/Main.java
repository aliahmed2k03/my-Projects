package com.classes;
import java.util.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Stack;
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3.0f);
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculateCirc());
    }
    public static void sumoftwonumbers() {
        Scanner num1 = new Scanner(System.in);
        int numA = num1.nextInt();
        int numB = num1.nextInt();
        numA += numB;
        System.out.println(numA);

        }// complete
    public static void DoWhileloop() {
        int x = 1;
        do {
            System.out.println(x);
            x++;
        }while (x<5);
    }// test function

    public static void daystoseconds() 
    {
        try (Scanner time = new Scanner(System.in)) 
        {
            int days = time.nextInt() * 24 * 60 * 60;
            System.out.println(days);
        }
    }


    public static void loancalculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter loan amount");
        int loan = input.nextInt();
        System.out.println("Enter the amount of months");
        int months = input.nextInt();
        System.out.println("Enter the percentage of what you'll pay each month");
        int remains = input.nextInt();
        remains = remains / 100;
        remains = 1 - remains;
        for (int i = 1; i == months; i++) {
            loan = loan / remains;
        System.out.println(loan);
        }
    }

    public static <list> void intervals(list arr[]) {

    }
}
