package Task;

import java.util.Scanner;

public class Grade_24_05 {
    public static void main(String[] args) {
        //step 1: scanner class
        //step 2: logic
        //step 3: optimize
        //step 4: edge class
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the grade of your children:");
        String Grade = scanner.next();
        Grade = Grade.toUpperCase();
        switch(Grade)
        {
            case "A":
                System.out.println("Excellent");
                break;

            case "B":
                System.out.println("Very Good");
                break;

            case "C":
                System.out.println("Good");
                break;

            case "D":
                System.out.println("Needs Improvement");
                break;

            case "F":
                System.out.println("Fail");
                break;

            default:
                System.out.println("Invalid grade");
                break;
        }
        System.out.println("End of the program");
    }
}
