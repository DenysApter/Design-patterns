package iterator.list;

import lombok.Data;

@Data
public class Node<T> {
     private Node next;
     private Node last;
     private T value;

    public Node(Node next, Node last, T value) {
        this.next = next;
        this.last = last;
        this.value = value;
    }
}
