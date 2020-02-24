package definition;
import adt.MyContactListAdt;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ContactList implements MyContactListAdt<Person> {
    private Node head;
    private int size;

    public Node getHead() {
        return head;
    }

    public ContactList() {
        head = null;
    }

    @Override
    public void add(Person data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
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

    }

    @Override
    public void search(String firstName) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            if (temp.getData().getFirstName().equals(firstName)) {
                count++;
            }
            temp = temp.getNext();

        }
        if (count != 0) {
            System.out.println(count + " " + "match found!");
        } else {
            System.out.println("" + "No result found");
        }
    }

    @Override
    public void view() {
        sort();
        System.out.println("---Here are all your contacts---\n" +
                "-------- * -------- * -------- * --------");
        Node temp1=head;
        while(temp1!=null){
            System.out.println(temp1.getData());
            temp1=temp1.getNext();
            System.out.println("-------- * -------- * -------- * --------"+"\n"+"-------- * -------- * -------- * --------");
        }
        System.out.println();
    }
    public void display(){
        sort();
        Scanner sc=new Scanner(System.in);
        System.out.println("Here are all your contacts");
        Node temp=head;
        int i=1;
        while(temp!=null){
            System.out.println(i +" "+ temp.getData().getFirstName()+" "+temp.getData().getLastName());
            temp=temp.getNext();
            i++;
        }
    }
    public void sort(){
        Node current = head, index = null;
        Person temp;

        if(head == null) {
            return;
        }
        else {
            while(current != null) {
                //Node index will point to node next to current
                index = current.getNext();

                while(index != null) {
                    //If current node's data is greater than index's node data, swap the data between them
                    if(current.getData().getFirstName().compareTo( index.getData().getFirstName() )> 0) {
                        temp = current.getData();
                        current.setData( index.getData());
                        index.setData( temp );
                    }
                    index = index.getNext();
                }
                current = current.getNext();
            }
        }

    }
}
