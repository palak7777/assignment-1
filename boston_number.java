import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        
        int isBostonNumber = isBoston(N);
        
        System.out.println(isBostonNumber);
        
        scanner.close();
    }

    public static int isBoston(int N) {
        int sumOfDigits = 0;
        
        // Calculate the sum of the digits of N
        int originalN = N;
        while (N > 0) {
            sumOfDigits += N % 10;
            N /= 10;
        }
        
        // Find prime factors of N and calculate their sum of digits
        for (int i = 2; i <= Math.sqrt(originalN); i++) {
            while (originalN % i == 0) {
                int primeFactor = i;
                while (primeFactor > 0) {
                    sumOfDigits -= primeFactor % 10;
                    primeFactor /= 10;
                }
                originalN /= i;
            }
        }
        
        // If N is still greater than 1, it's a prime factor greater than sqrt(N)
        if (originalN > 1) {
            while (originalN > 0) {
                sumOfDigits -= originalN % 10;
                originalN /= 10;
            }
        }
        
        // If the sum of digits of N is 0, it's a Boston number
        return sumOfDigits == 0 ? 1 : 0;
    }
}
