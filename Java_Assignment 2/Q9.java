//Write a program to reverse the digits of a given integer number.

public class Q9{
    public static void main(String[] args){
        int num = 9874;
        int rev = 0;
        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reverse number is: " + rev);
    }
}