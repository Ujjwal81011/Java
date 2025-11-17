import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class file {
   public static void main(String[] args) {
    try {

        File f = new File("hii.txt");// file create krne ke liye

        FileWriter fw = new FileWriter("hii.txt"); // File mein write krne ke liye
        fw.write("are you reading file handling ");
        fw.write("wo log bhi padh rhe honge");
        System.out.println("data likh gya hai");
        fw.close();

        FileReader fr = new FileReader("hii.txt"); //file read krne ke liye
        int ch;
        while ((ch = fr.read()) != -1) {
            System.out.print((char)ch);
        }
        fr.close();

        if (f.delete()) // file ko delete krne ke liye
        { 
            System.out.println("File delete ho gayi!");
        } else {
            System.out.println("File delete nahi hui.");
        }
    } 

    catch (Exception e) 
    {
        System.out.println("error aa gya hai");
    }

   } 
}