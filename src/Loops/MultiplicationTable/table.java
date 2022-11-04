package Loops.MultiplicationTable;
// Print multiplication table of 24, 50 and 29 using loop.

import java.util.Scanner;

public class table {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What multiplication table do you want to see?");
        int input = sc.nextInt();
        for (int i = 0; i <= 10; i++) {
            System.out.println(input + " * " + i +"\t=\t" + (input*i));
        }
    }
}
