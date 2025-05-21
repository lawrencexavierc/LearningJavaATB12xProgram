package Task;

public class GreaterOfThree_17_05 {
    public static void main(String[] args) {
        int a = 34;
        int b = 7;
        int c = 67;
       String big = (a > b) ? (a > c ? "a is greater":"c is greater") : (b>c ? "b is greater": "c is greater");
      System.out.println(big);
    }
}
