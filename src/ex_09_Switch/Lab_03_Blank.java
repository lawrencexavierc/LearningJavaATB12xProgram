package ex_09_Switch;

import java.util.Scanner;

public class Lab_03_Blank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number from 1 to 7");
        int day = scanner.nextInt();
        switch (day){
            case 1:
                System.out.println("Mon");
                break;
            case 2:
                System.out.println("Tue");
                break;

        }
    }
}
