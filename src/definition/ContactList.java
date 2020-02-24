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
        Node temp = head;
        Node previous = null;
        String result = "";
        if (item == 1) {
            result = (String) (temp.getData().getFirstName() + " " + temp.getData().getLastName());
            System.out.println(result + "'s contact deleted from list!");
            head = temp.getNext();
            temp = head;
        } else {
            try {
                for (int i = 1; i <= size; i++) {
                    if (i == item) {
                        result = (String) (temp.getData().getFirstName() + " " + temp.getData().getLastName());
                        System.out.println(result + "'s contact deleted from list!");
                        previous.setNext(temp.getNext());
                        size--;
                        break;
                    }
                    previous = temp;
                    temp = temp.getNext();
                }
            } catch (NullPointerException e) {
                System.out.println("Contact List is Empty");
            }
    }

    @Override
    public void search(String first) {

    }

    @Override
    public void view() {

    }
}
