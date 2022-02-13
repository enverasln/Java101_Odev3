package com.enveraslan;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a, b, c;

        System.out.print("Please enter the first number: ");
        a = input.nextInt();

        System.out.print("Please enter the second number: ");
        b = input.nextInt();

        System.out.print("Please enter the third number: ");
        c = input.nextInt();


        if (a < b && a < c) {
            if (b < c) {
                printOrder(a, b, c);
            } else {
                printOrder(a, c, b);
            }
        } else if (b < a && b < c) {
            if (a < c) {
                printOrder(b, a, c);
            } else {
                printOrder(b, c, a);
            }
        } else if (c < a && c < b) {
            if (a < b) {
                printOrder(c, a, b);
            } else {
                printOrder(c, b, a);
            }
        }
    }

    public static void printOrder(int a, int b, int c) {
        System.out.println(a + " < " + b + " < " + c);
    }
}
