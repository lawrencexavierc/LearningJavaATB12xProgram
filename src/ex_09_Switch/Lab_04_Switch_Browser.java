package ex_09_Switch;

import java.util.Scanner;

public class Lab_04_Switch_Browser {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the browser");
        String browser = scanner.next();
        browser = browser.toLowerCase();

        switch(browser)
        {
            case "chrome":
                System.out.println("Starting the Chrome");
                break;
            case "firefox":
                System.out.println("Starting the firefox");
                break;
            case "edge":
                System.out.println("Starting the edge");
                break;
            default:
                System.out.println("Not able to identify the browser");
                break;
        }
        System.out.println("End of the program");
    }
}
