import java.util.Scanner;

public class binary_to_decimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String binaryString = scanner.next();

        int decimalValue = convertBinaryToDecimal(binaryString);

        System.out.println(decimalValue);

        scanner.close();
    }

    public static int convertBinaryToDecimal(String binaryString) {
        int decimalValue = 0;
        int power = 0;

        // Iterate through the binary string from right to left
        for (int i = binaryString.length() - 1; i >= 0; i--) {
            char digit = binaryString.charAt(i);
            if (digit == '1') {
                decimalValue += Math.pow(2, power);
            }
            power++;
        }

        return decimalValue;
    }
}
