import java.util.Scanner;
public class Demo2
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int num;
        System.out.println("Enter a number: ");
        num = input.nextInt();
        if(num % 2 == 0)
        {
            System.out.println("The number is even");
        }
        else
        {
            System.out.println("The number is odd");
        }
        System.out.println("Enter a character: ");
        char ch = input.next().charAt(0);
        switch (ch) {
            case 'a':
                System.err.println("Vowel a");
                break;
            case 'e':
                System.err.println("Vowel e");
                break;
            case 'i':
                System.err.println("Vowel i");
                break;
            case 'o':
                System.err.println("Vowel o");
                break;
            case 'u':
                System.err.println("Vowel u");
                break;
            default:
                System.err.println("Consonant");
                break;
        }
    }
}