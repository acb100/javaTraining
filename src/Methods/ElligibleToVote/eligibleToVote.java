package Methods.ElligibleToVote;

import java.util.Scanner;

/*A person is eligible to vote if his/her age is greater than or equal to 18.
 Define a method to find out if he/she is eligible to vote.*/
public class eligibleToVote {

    public static void vote() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        if (age < 18) {
            System.out.println("Not eligible to vote");
        } else {
            System.out.println("Eligible to vote");
        }
    }

    public static void main(String[] args) {
        vote();
    }
}
