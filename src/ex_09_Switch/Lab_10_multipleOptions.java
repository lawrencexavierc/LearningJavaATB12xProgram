package ex_09_Switch;

public class Lab_10_multipleOptions {
    public static void main(String[] args) {
        int itemcode = 002;
        switch (itemcode)
        {
            case 001, 002, 003:
                System.out.println("All are electronic products");
                break;
            case 004, 005, 006:
                System.out.println("All are stationary products");
                break;
            default:
                System.out.println("Other products");
        }
    }
}
