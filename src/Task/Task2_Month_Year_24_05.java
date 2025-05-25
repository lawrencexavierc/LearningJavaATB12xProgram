package Task;

import java.util.Scanner;

public class Task2_Month_Year_24_05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Month");
        int month = scanner.nextInt();
        System.out.println("Enter the Year");
        int year = scanner.nextInt();
        switch (month){
            case 1:
                System.out.println("The Month is January having 31 days");
                System.out.println("The year is" + year);
                break;
            case 2:
                if (year%4==0) {
                    System.out.println("The Month is February having 29 days");
                    System.out.println("The year " + year + " is an leap year");
                              }
                else {
                    System.out.println("The Month is February having 28 days");
                    System.out.println("The year is " + year);
                     }
                break;
            case 3:
                System.out.println("The Month is March having 31 days");
                System.out.println("The year is" + year);
                break;
            case 4:
                System.out.println("The Month is April having 30 days");
                System.out.println("The year is" + year);
                break;
            case 5:
                System.out.println("The Month is May having 31 days");
                System.out.println("The year is" + year);
                break;
            case 6:
                System.out.println("The Month is June having 30 days");
                System.out.println("The year is" + year);
                break;
            case 7:
                System.out.println("The Month is July having 31 days");
                System.out.println("The year is" + year);
                break;
            case 8:
                System.out.println("The Month is August having 31 days");
                System.out.println("The year is" + year);
                break;
            case 9:
                System.out.println("The Month is September having 30 days");
                System.out.println("The year is" + year);
                break;
            case 10:
                System.out.println("The Month is October having 31 days");
                System.out.println("The year is" + year);
                break;
            case 11:
                System.out.println("The Month is November having 30 days");
                System.out.println("The year is" + year);
                break;
            case 12:
                System.out.println("The Month is December having 31 days");
                System.out.println("The year is" + year);
                break;
            default:
                System.out.println("Not a valid month");
               // System.out.println("Not a valid year");
        }
    }
}
