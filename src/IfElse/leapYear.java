package IfElse;

import java.util.Scanner;

/*Write a program to check if a year is leap year or not.
If a year is divisible by 4 then it is leap year but if the year is century year like 2000, 1900, 2100
then it must be divisible by 400.*/
public class leapYear {

    public static boolean checkYear(int year){
        if (year %400 == 0){
            System.out.println("Leap year");
            return true;
        }
        if (year % 100 == 0){
            System.out.println("Not a leap year");
            return false;
        }
        if (year %4 == 0){
            System.out.println("Leap year");
            return true;
        } else {
            System.out.println("Not a leap year");
            return false;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What year do you want to check?");
        int choice = sc.nextInt();
        System.out.println(checkYear(choice));
    }
}
