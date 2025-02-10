//WAP to find average of consecutive N Odd numbers and even numbers.

public class Q14{
    public static void main(String[] args){
        int n = 10;
        int sumOdd = 0;
        int sumEven = 0;
        int countOdd = 0;
        int countEven = 0;
        for(int i = 1; i <= n; i++){
            if(i % 2 != 0){
                sumOdd += i;
                countOdd++;
            }else{
                sumEven += i;
                countEven++;
            }
        }
        System.out.println("Average of consecutive " + countOdd + " odd numbers is: " + (sumOdd / countOdd));
        System.out.println("Average of consecutive " + countEven + " even numbers is: " + (sumEven / countEven));
    }
}