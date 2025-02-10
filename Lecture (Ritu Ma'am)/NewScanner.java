import java.util.*;

public class NewScanner {
    public  static void main (String[] args) {
        Scanner bhadwakishan = new Scanner (System.in);
        System.out.println("Enter your first number:");
        int a = bhadwakishan.nextInt();
        System.out.println("Enter your second number:");
        int b = bhadwakishan.nextInt();
        int sum = a + b;
        System.out.println("The sum of the two numbers is: " + sum);
    }
}

