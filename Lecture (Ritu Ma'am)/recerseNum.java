

public class recerseNum{
    public static void main(String[] args){
        int num = 9876;
        int rev = 0;
        while(num != 0){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = num / 10;
        }
        System.out.println("Reverse number is: " + rev);
    }
}

