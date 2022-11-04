package Methods.CircumferenceCircle;

import java.util.Scanner;

//Write a program to print the circumference and area of a circle of radius entered by user by defining your own method.
public class circleCircumference {
    public static void Circle(){
        Scanner sc = new Scanner(System.in);
        int radius;
        System.out.println("Enter the radius: ");
        radius = sc.nextInt();
        System.out.println("Circumference is: " + (2*3.14*radius) + "\nThe area of the circle is: " +
                (3.14*radius*radius));
    }

    public static void main(String[] args) {
        Circle();
    }
}
