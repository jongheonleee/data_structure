package List;

import java.util.NoSuchElementException;

public class DList <E extends Comparable> {

    protected DNode head, tail;
    protected int size;

    public DList() {
        head = new DNode(null, null, null);
        tail = new DNode(null, null, null);
        head.setNext(tail);
        size = 0;
    }

    public void insertBefore(DNode target, E newItem) {
        DNode prev = target.getPrev();
        DNode node = new DNode(newItem, prev, target);

        prev.setNext(node);
        target.setPrev(node);

        size++;
    }

    public void insertAfter(DNode target, E newItem) {
        DNode next = target.getNext();
        DNode node = new DNode(newItem, target, next);

        target.setNext(node);
        next.setPrev(node);

        size++;
    }

    public void delete(DNode target) {
        if (target == null) throw new NoSuchElementException();

        DNode prev = target.getPrev();
        DNode next = target.getNext();

        prev.setNext(next);
        next.setPrev(prev);

        size--;
    }



}

class DNode <E extends Comparable> {
    private E item;
    private DNode prev;
    private DNode next;

    public DNode(E newItem, DNode prev, DNode next) {
        item = newItem;
        this.prev = prev;
        this.next = next;
    }

    public E getItem() {
        return item;
    }

    public void setItem(E item) {
        this.item = item;
    }

    public DNode getPrev() {
        return prev;
    }

    public void setPrev(DNode prev) {
        this.prev = prev;
    }

    public DNode getNext() {
        return next;
    }

    public void setNext(DNode next) {
        this.next = next;
    }
}
