package ex_10_For_Loop;

public class Lab_011_Continue_Odd {
    public static void main(String[] args) {
        for (int i = 0; i <=50 ; i++) {
            if (i%2==0)
            {
                //System.out.println(i);
                continue;
            }
            System.out.println("Odd ->" +i);
        }
    }
}
