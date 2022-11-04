package Loops.inputsUntilQ;

import java.util.Scanner;

// Take integer inputs from user until he/she presses q ( Ask to press q to quit after every integer input ). Print average and product of all numbers.
public class inputsUntilQ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String choice = "";

        int sum = 0;
        int product = 1;
        int count = 0;

        while (!choice.equals("q")){
            System.out.println("Enter a choice or press q to quit.");
            choice = sc.next();

            if (!choice.equals("q")){
                int number = Integer.parseInt(choice);
                sum = sum+number;
                product = product+number;
                count++;
            }
        }
        System.out.println("The product is: " + product + "\nThe average is: " + ((float)+sum/count));
    }

}
