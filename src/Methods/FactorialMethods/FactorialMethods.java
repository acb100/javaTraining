package Methods.FactorialMethods;
/*Write a program to print the factorial of a number by defining a method named 'Factorial'.
Factorial of any number n is represented by n! and is equal to 1*2*3*....*(n-1)*n. */
public class FactorialMethods {
    public static int fact(int x){
        if (x == 0 || x == 1){
            return 1;
        } else {
            return fact(x-1)*x;
        }
    }

    public static void main(String[] args) {
        System.out.println(fact(5));
        System.out.println(fact(7));
        System.out.println(fact(2));
        System.out.println(fact(10));
        System.out.println(fact(4));
    }
}
