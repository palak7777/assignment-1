public class prime_or_not {

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (isPrime(N)) {
            System.out.println("Prime");
        } else {
            System.out.println("Not Prime");
        }

        scanner.close();
    }

    public static boolean isPrime(int N) {
        if (N <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }

        if (N <= 3) {
            return true; // 2 and 3 are prime
        }

        if (N % 2 == 0 || N % 3 == 0) {
            return false; // Numbers divisible by 2 or 3 are not prime
        }

        // Check for prime by iterating from 5 to the square root of N
        for (int i = 5; i * i <= N; i += 6) {
            if (N % i == 0 || N % (i + 2) == 0) {
                return false; // Numbers divisible by i or i+2 are not prime
            }
        }

        return true; // If none of the above conditions are met, N is prime
    }
}}
