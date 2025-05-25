package ex_10_For_Loop;

public class Lab_05_For_If {
    public static void main(String[] args) {
        for (int age=15; age<20; age++)
        {
            if (age>=18)
            {
                System.out.println("Allowed to vote");
            }
            else {
                System.out.println("Not Allowed to vote");
            }
        }
    }
}
