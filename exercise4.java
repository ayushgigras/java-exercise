import java.util.*;
public class exercise4 {
    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static int[] generatePrimes(int n) {
        if (n <= 0) {
            return new int[0];
        }
        int[] primes = new int[n];
        int count = 0;
        int num = 2;
        while (count < n) {
            if (isPrime(num)) {
                primes[count] = num;
                count++;
            }
            num++;
        }
        return primes;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of prime numbers to generate: ");
        int n = sc.nextInt();
        int[] pn = generatePrimes(n);
        if (pn.length > 0) {
            System.out.println("The first " + n + " prime numbers are:");
            for (int i = 0; i < pn.length; i++) {
                System.out.print(pn[i]);
                if (i < pn.length - 1) {
                    System.out.print(", ");
                }
            }
        } else {
            System.out.println("No prime.");
        }
    }
}