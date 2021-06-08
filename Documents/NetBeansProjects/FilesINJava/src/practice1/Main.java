
package practice1;
//practice package"Files" in Java

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
      List<Contact> savedContacts=FilesOperationsMain.readFromFile();
        for (Contact savedContact : savedContacts) {
            System.out.println(savedContact);
         
        }
  
        List<Contact> contacts=new ArrayList<>();
        int t=1;
        while(t==1){
            try {
                Scanner sc=new Scanner(System.in);
                System.out.println("age: ");
                int age=sc.nextInt();
                
                System.out.println("phone: 0034xxxxxxxxx");
                String code="0034";
                System.out.print(code);
                String phone=code+sc.next();
                
                System.out.println("firstname");
                String firstName=sc.next();
                
                System.out.println("lastname");
                String lastName=sc.next();
                
                System.out.println("address");
                String address=sc.next();
                
                
                Contact contact=new Contact(firstName, lastName, address, phone, age);
                contacts.add(contact);
                System.out.println("to add more press 1, otherwise end program");
                t=sc.nextByte();
            } catch (Exception e) {
                t=1;
                System.out.println("restart program");
            }
        
        }
        
        System.out.println("values of contacts");
        for (Contact contact : contacts) {
            System.out.println(contact);
           
        }
        
        System.out.println("-----after sort-------");
        Collections.sort(contacts);
        
        for (Contact contact1 : contacts) {
            System.out.println(contact1);
         
        }
        FilesOperationsMain.writeToFile(contacts);
        
}}
