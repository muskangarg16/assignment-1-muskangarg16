package definition;

import adt.MyContactListAdt;

public class ContactList implements MyContactListAdt<Person> {
    private Node head;
    private int size;
    public Node getHead(){
        return head;
    }
    public ContactList(){
        head=null;
    }
    @Override
    public void add(Person data) {

    }

    @Override
    public void remove(int item) {

    }

    @Override
    public void search(String first) {

    }

    @Override
    public void view() {

    }
}
