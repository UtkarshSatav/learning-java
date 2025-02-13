
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileDemo {
    
    public static void main(String[] args) {

    File f1;
        f1 = new File(".txt");

    try{
    f1.createNewFile(); 
    }
    catch(IOException e)
    {
        System.out.println("Error creating file");
    }

    try{
        try (FileWriter f2 = new FileWriter("abc.txt")) {
            
            f2.write("Adding some content to the file");
            f2.write("Hellow everyone!");
        }
    }
    catch(IOException e)
    {
        System.out.println("Error creating file");
    }

    File f3 = new File("pqr.txt");
    try{
    Scanner sc = new Scanner(f3);
    while(sc.hasNextLine()){

        String data = sc.nextLine();
        System.out.println(data);

    }
    }
    catch(FileNotFoundException e)
    {
        System.out.println("file not found");
    
    }

    File f4 = new File("xyz.txt");
    f4.delete();
}
}