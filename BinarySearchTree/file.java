import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class file{
    public static void main( String[] args) {
        try {
            File mydata = new File("dataset (1).txt");
            Scanner myReader = new Scanner(mydata);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
            } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();        
        
        
        
        }    
    
    
    
    }    



}