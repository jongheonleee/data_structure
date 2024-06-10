package book.chapter02;

import java.util.EmptyStackException;

// 리스트로 구현한 스택
public class ListStack <E> {

    private Node<E> top;
    private int size;

    public ListStack() {
        top = null;
        size = 0;
    }

    public E peek() {
        if (isEmpty()) throw new EmptyStackException();

        return top.getItem();
    }

    public void push(E newItem) {
        Node newNode = new Node(newItem, top);
        top = newNode;
        size++;
    }

    public E pop() {
        if (isEmpty()) throw new EmptyStackException();

        E topItem = top.getItem();
        top = top.getNext();
        size--;
        return topItem;
    }

    public int size() {return size;}
    public boolean isEmpty() {
        return size == 0;
    }

}

class Node <E> {
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

