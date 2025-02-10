//WAP to check whether the inputted number is Armstrong Number or not.

public class Q11{
    public static void main(String[] args){
        int num = 153;
        int temp = num;
        int sum = 0;
        while(num != 0){
            int digit = num % 10;
            sum += digit * digit * digit;
            num = num / 10;
        }
        if(temp == sum){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not an Armstrong Number");
        }
    }
}