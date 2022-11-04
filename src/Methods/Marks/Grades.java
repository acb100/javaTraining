package Methods.Marks;

import java.util.Scanner;

/*Write a program which will ask the user to enter his/her marks (out of 100).
Define a method that will display grades according to the marks entered as below: */
public class Grades {
    public static void grades() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Type in your grade");
        int grade = sc.nextInt();
        if (grade >= 91 && grade <= 100) {
            System.out.println("AA");
        } else if (grade >= 81 && grade <= 90) {
            System.out.println("AB");
        } else if (grade >= 71 && grade <= 80) {
            System.out.println("BB");
        } else if (grade >= 61 && grade <= 70) {
            System.out.println("BC");
        } else if (grade >= 51 && grade <= 60) {
            System.out.println("CD");
        } else if (grade >= 41 && grade <= 50) {
            System.out.println("DD");
        } else if (grade <= 40) {
            System.out.println("FAIL!");
        }
    }

    public static void main(String[] args) {
        grades();
    }
}
