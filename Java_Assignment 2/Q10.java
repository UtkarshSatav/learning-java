//Write a program to find sum of digits of a number.

public class Q10{
    public static void main(String[] args){
        int num = 9874;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum += digit;
            num = num / 10;
        }
        System.out.println("Sum of digits of a number is: " + sum);
    }
}