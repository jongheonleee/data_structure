package List;

import java.util.NoSuchElementException;

public class SList <E extends Comparable> {
    protected Node head;
    private int size;

    public SList() {
        head = null;
        size = 0;
    }

    public int search(E target) {
        Node curr = head;

        for (int k=0; k<size; k++) {
            if (curr.getItem().compareTo(target) == 0)
            curr = curr.getNext();
        }

        return -1;
    }

    public void insertFront(E newItem) {
        head = new Node(newItem, head);
        size++;
    }

    public void insertAfter(E newItem, Node prev) {
        prev.setNext(new Node(newItem, prev.getNext()));
        size++;
    }

    public void deleteFront() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        head = head.getNext();
        size--;
    }

    public void deleteAfter(Node prev) {
        if (prev == null) {
            throw new IllegalArgumentException();
        }

        Node target = prev.getNext();
        prev.setNext(target.getNext());
        target.setNext(null);

        size--;
    }


    private boolean isEmpty() {
        return size == 0;
    }
}

class Node <E extends Comparable> {
    private E item;
    private Node<E> next;

    public Node(E newItem, Node<E> node) {
        item = newItem;
        next = node;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public Node<E> getNext() {
        return next;
    }

    public void setNext(Node<E> next) {
        this.next = next;
    }
}
