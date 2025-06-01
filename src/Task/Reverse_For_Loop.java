package Task;

import java.sql.SQLOutput;
import java.util.Scanner;
public class Reverse_For_Loop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number to Reverse");
        int number = scanner.nextInt();
        int reverse = 0;

        // For loop to reverse the number
        for (; number != 0; number = number / 10) {
            int digit = number % 10;      // Get the last digit
            reverse = reverse * 10 + digit; // Append it to the reversed number
        }
        System.out.println(reverse);
        scanner.close();
    }
}
