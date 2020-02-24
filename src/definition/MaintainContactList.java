package definition;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Scanner;

public class MaintainContactList {
    ContactList list = new ContactList();
    Scanner sc= new Scanner(System.in);

    public Person addContact() {

        Person person =new Person();
        System.out.println("You have chosen to add a new contact:\n"+
                "Please enter the name of the Person");
        System.out.print("First Name:");
        String firstName = sc.nextLine();
        person.setFirstName(firstName);
        System.out.print("Last Name:");
        String lastName = sc.nextLine();
        person.setLastName(lastName);
        ArrayList<Long> num=new ArrayList<>();
        while(true) {

            System.out.println("Contact number:");
        long phoneNo = sc.nextLong();
        num.add(phoneNo);

            System.out.println("Would you like to add another contact number? (y/n):");
            sc.nextLine();
            String ch = sc.nextLine();
            if (ch.equals("y")) {
                System.out.println("Contact Number:");
                long phone = sc.nextLong();
                num.add(phone);
            }
            else{
                break;
            }
        }
        person.setContactList(num);
        System.out.println("Would you like to add email address? (y/n):");
        String choice=sc.nextLine();
        if(choice.equals("y")) {
            System.out.println("Email:");
            String email = sc.nextLine();
            person.setEmail(email);
        }
        return person;
    }
}











