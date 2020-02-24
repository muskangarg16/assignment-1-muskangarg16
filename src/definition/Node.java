package definition;

public class Node {
    private Person data;
    private Node next;

    public Node(Person data, Node next) {
        this.data = data;
        this.next = next;
    }
}
