package execution;


import definition.MaintainContactList;
import definition.Person;
import definition.ContactList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ContactList list = new ContactList();
        MaintainContactList obj = new MaintainContactList();
        Person per = new Person();
        while (true) {
            System.out.println("Welcome to Muskan's Contact List App\n" +
                    "Press 1 to add a new contact\n" +
                    "Press 2 to view all contacts\n" +
                    "Press 3 to search for a contact\n" +
                    "Press 4 to delete a contact\n" +
                    "Press 5 to exit program.");
            int choice = sc.nextInt();
            sc.nextLine();
            switch (choice) {
                case 1:
                    list.add(obj.addContact());
                    break;

                case 2:
                    list.view();
                    break;
                case 3:
                    System.out.println("You could search for a contact from their first names:");
                    String firstName = sc.nextLine();
                    list.search(firstName);
                    break;
                case 4:
                    list.display();
                    System.out.println("Press the number against the contact to delete it");
                    int c=sc.nextInt();
                    list.remove(c);
                    break;
                case 5:
                    System.exit(0);
                    break;
            }
        }
    }


}
