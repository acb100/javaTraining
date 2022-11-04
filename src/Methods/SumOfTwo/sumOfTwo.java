package Methods.SumOfTwo;

import java.util.Scanner;
// Write a program to print the sum of two numbers entered by user by defining your own method.
public class sumOfTwo {

    public static void Sum(){
        Scanner sc = new Scanner(System.in);
        int x, y;
        System.out.println("Enter number 1: ");
        x = sc.nextInt();
        System.out.println("Enter number 2: ");
        y = sc.nextInt();
        System.out.println("The result is: " + (x + y));
    }

    public static void main(String[] args) {
        Sum();
    }
}
