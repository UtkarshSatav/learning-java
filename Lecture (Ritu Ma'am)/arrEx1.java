
// public class lecture{
//     public static void main(String[] args){
//         int[] arr = {1, 2, 3, 4, 5};
//         int sum = 0;
//         for(int i = 0; i < arr.length; i++){
//             sum += arr[i];
//         }
//         System.out.println("Sum of elements of the array is: " + sum);
//     }
// }

// import java.util.Scanner;

// public class arrEx1{
//     public static void main(String[] args){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the size of the array: ");
//         int len = sc.nextInt();
//         int[] arr = new int[len];
//         System.out.println("Enter the elements of the array: ");
//         for(int i = 0; i < len; i++){
//             arr[i] = sc.nextInt();
//         }
//         int sum = 0;
//         for(int i = 0; i < arr.length; i++){
//             sum += arr[i];
//         }
//         System.out.println("Sum of elements of the array is: " + sum);
//     }
// }

//WAP to store elements in jagged and print them in reverse order.

class jagged
{
    public static void main(String[] args)
    {
        int[][] arr = new int[3][];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[4];
        int count = 1;
        for(int i = 0; i < arr.length; i++)
        {
            for(int j = 0; j < arr[i].length; j++)
            {
                arr[i][j] = count;
                count++;
            }
        }
        for(int i = arr.length - 1; i >= 0; i--)
        {
            for(int j = arr[i].length - 1; j >= 0; j--)
            {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}






