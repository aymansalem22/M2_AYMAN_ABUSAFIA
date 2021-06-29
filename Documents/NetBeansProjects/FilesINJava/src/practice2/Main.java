
package practice2;

import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class Main {

    /**
     * practice package filespractice
     */
    public static void main(String[] args) {
        
    List<Contact> contacts=FilesOperationsMain.readFromFile();
        for (Contact savedContact : contacts) {
            System.out.println(savedContact);
        }
        
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
                
                System.out.println("firstName");
                String firstName=sc.next();
                
                System.out.println("lastname");
                String lastName=sc.next();
                
                System.out.println("address");
                String address=sc.next();
                
                System.out.println("Gender m or f");
                String gender=sc.next();
                
                System.out.println("Email");
                String email=sc.next();
                
                Contact contact=new Contact(firstName, lastName, address, phone, email, age, gender);
                contacts.add(contact);
                System.out.println("to enter more press 1, otherwise stop");
                t=sc.nextByte();
                
            } catch (Exception e) {
                t=1;
                System.out.println("restart program");
            }
        
        }
        
        for(Contact contact:contacts){
            System.out.println(contact);
        }
        System.out.println("*****After Sort******");
        Collections.sort(contacts);
        for(Contact ordersContacts:contacts){
            System.out.println(ordersContacts);
        }
        
        FilesOperationsMain.writeTofile(contacts);
        
    }
    
}
