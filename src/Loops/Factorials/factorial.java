package Loops.Factorials;

import java.util.Scanner;

// Write a Java program to calculate factorial of a number. n!
public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int x = sc.nextInt();
        int fact = 1;
        for (int i = x; i >= 1; i--) {
            fact = fact*i;
        }
        System.out.println("The factorial value is: " + fact);
    }
}
