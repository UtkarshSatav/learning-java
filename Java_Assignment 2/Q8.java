//Write a program to Check whether a character is a vowel or consonant using switch statement.

public class Q8{
    public static void main(String[] args){
        char ch = 'a';
        switch(ch){
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
        }
    }
}