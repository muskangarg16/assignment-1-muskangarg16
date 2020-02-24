package definition;

public class Node {
    private Person data;
    private Node next;

    public Node(Person data, Node next) {
        this.data = data;
        this.next = next;
    }

    public Person getData() {
        return data;
    }

    public void setData(Person data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
