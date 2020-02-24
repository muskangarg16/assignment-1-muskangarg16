package definition;

import java.util.ArrayList;

public class Person {
    private String firstName;
    private String lastName;
    private ArrayList<Long> contactList;
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String FName) {
        this.firstName = FName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String LName) {
        this.lastName = LName;
    }


    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        if (getContactList().size() == 1) {
            return "First Name: " + getFirstName() + "\n" + "Last Name: " + getLastName() + "\n" + "Contact Number: " + getContactList().get(0) + "\n" + "Email address: " + getEmail();
        } else {
            return "First Name: " + getFirstName() + "\n" + "Last Name: " + getLastName() + "\n" + "Contact number(s): " + getContactList() + "\n" + "Email address: " + getEmail();
        }
    }

    public ArrayList<Long> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<Long> contactList) {
        this.contactList = contactList;
    }
}