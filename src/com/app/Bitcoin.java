package com.app;

import java.util.Scanner;

public class Bitcoin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is Bitcoin price today?");
        System.out.println("input price ");
        double a = scanner.nextInt();
        System.out.println("How much $ do you have?");
        double b = scanner.nextInt();
        double result = b / a;
        System.out.println("You can buy " + result);
    }
}
