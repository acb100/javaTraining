package Methods.EvenOrOdd;

import java.util.Scanner;

//Define a program to find out whether a given number is even or odd.
public class EvenOdd {

    public static void evenOrOdd(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int a = sc.nextInt();

        if (a % 2 == 0){
            System.out.println("Number is even");
        } else{
            System.out.println("Number is odd");
        }
    }

    public static void main(String[] args) {
        evenOrOdd();
    }
}
