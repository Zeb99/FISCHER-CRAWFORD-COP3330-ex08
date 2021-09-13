package org.example;
import java.util.Scanner;
/**
 * Pizza Party
 * UCF cop3330 Fall 2021 Assignment 8 Solution
 * Copyright 2021 Zeb Fischer-Crawford
 *
 */
public class App 
{
    public static void main( String[] args )

    {
        Scanner scan = new Scanner(System.in);
        System.out.println("How many people? ");
        int numPeople = scan.nextInt();
        System.out.println("How many pizzas do you have? ");
        int numPizzas = scan.nextInt();
        System.out.println("How many slices per pizza? ");
        int numSlices = scan.nextInt();

        int total = numPizzas * numSlices;

        System.out.println("" + numPeople +  " people with " + numPizzas + " pizzas (" + total + " slices)");

        int quotient = total/numPeople;
        System.out.println("Each person gets " + quotient + " pieces of pizza.");

        int remainder = total%numPeople;
        System.out.println("There are " + remainder + " leftover pieces.");

    }
}
