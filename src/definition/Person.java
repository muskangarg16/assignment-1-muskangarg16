package definition;

import java.math.BigInteger;
import java.util.ArrayList;

public class Person {
    private String FName;
    private String LName;
    private ArrayList<BigInteger> contactList = new ArrayList<>();
    private String email;

    public String getFName() {
        return FName;
    }

    public void setFName(String FName) {
        this.FName = FName;
    }

    public String getLName() {
        return LName;
    }

    public void setLName(String LName) {
        this.LName = LName;
    }

    public ArrayList<BigInteger> getContactList() {
        return contactList;
    }

    public void setContactList(ArrayList<BigInteger> contactList) {
        this.contactList = contactList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
