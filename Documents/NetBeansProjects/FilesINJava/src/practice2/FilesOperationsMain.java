
package practice2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;


public class FilesOperationsMain {
   
    public static final String PATH="C:\\test\\cfd.txt";
    
    public static void writeTofile(List<Contact> contacts){
        try {
          FileWriter writer=new FileWriter(PATH);
          PrintWriter out=new PrintWriter(writer);
            for (Contact contact : contacts) {
                out.println(contact);
            }
            out.close();
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    
    
    public static List<Contact> readFromFile(){
    List<Contact> contacts=new ArrayList<>();
        try {
            FileReader reader=new FileReader(PATH);
            BufferedReader in=new BufferedReader(reader);
            String line="";
            while((line=in.readLine())!=null){
            Contact contact=new Contact(line);
            contacts.add(contact);
            
            if(Contact.addid<contact.getId()+1){
            contact.addid=contact.getId()+1;
            }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return contacts;
    }
    
}
