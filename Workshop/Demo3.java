import java.util.Scanner;
public class Demo3
{
    public static void main(String[] args)
    {//array init
    Scanner input = new Scanner(System.in);

    int[] mark = new int[10];
    for (int k=0; k<10; k++)
    {
        mark[k] = input.nextInt();
    }
    for (int k=0; k<10; k++)
    {
        System.out.println(mark[k]);
    }
    int data[][] = new int[3][3];
    for (int i=0; i<3; i++)
    {
        for (int j=0; j<3; j++)
        {
            System.out.println("Enter the data for row " + i + " and column " + j);
            data[i][j] = input.nextInt();
        }
    }
    for (int i=0; i<3; i++)
    {
        for (int j=0; j<3; j++)
        {
            System.out.print(data[i][j] + " ");
            
        }
    }
}
}
