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
        Node node =new Node(data);
        if(head==null){
            head=node;
        }
        else{
            Node temp=head;
            while(temp.getNext()!=null){
                temp=temp.getNext();
            }
            temp.setNext(node);
            size++;
        }
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
