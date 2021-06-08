
package practice1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class FilesOperations {
 public static final String PATH="C:\\test\\testfiles.txt"; 
 
    public static void main(String[] args) {
        
       try {
            //write to file
            FileWriter writer=new FileWriter(PATH);
            PrintWriter out=new PrintWriter(writer);
            out.println("Hello");
            out.println("1");
            out.println("2");
            out.println("Bye");
            out.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
        
        
        try {
            //read from file already has information 
            
            FileReader reader=new FileReader(PATH);
            BufferedReader in=new BufferedReader(reader);
            while(true){
            String line=in.readLine();
            if(line==null){
            break;
            }
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
}
