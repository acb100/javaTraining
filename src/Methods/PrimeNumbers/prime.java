package Methods.PrimeNumbers;
//Define a method to find out if number is prime or not.
public class prime {
    public static boolean isPrime(int x) {
        boolean isPrime = true;
        if (x>1){
            for (int i = 2; i < x; i++) {
                if (x % i == 0){
                    isPrime = false;
                    break;
                }
            }
        } else {
            isPrime = false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        System.out.println(isPrime(6));
        System.out.println(isPrime(11));
    }
}
