import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        
        int inverse = calculateInverse(number);
        
        System.out.println(inverse);
        
        scanner.close();
    }

    public static int calculateInverse(int number) {
        int inverse = 0;
        int position = 1;

        while (number > 0) {
            int digit = number % 10; // Get the last digit
            int newDigitPosition = digit;
            
            // Calculate the new position based on the digit
            int powerOfTen = 1;
            for (int i = 1; i < digit; i++) {
                powerOfTen *= 10;
            }
            newDigitPosition = powerOfTen;
            
            // Build the inverse number
            inverse += newDigitPosition * position;
            
            // Move to the next position
            position *= 10;
            number /= 10; // Remove the last digit
        }
        
        return inverse;
    }
}
