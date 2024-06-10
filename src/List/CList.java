package List;

import java.util.NoSuchElementException;

public class CList<E extends Comparable> {


    private Node last;
    private int size;

    public CList() {
        last = null;
        size = 0;
    }

    public void insert(E newItem) { // last가 가르키는 노드의 다음에 새 노드 삽입
        Node newNode = new Node(newItem, null);

        if (last == null) {
            newNode.setNext(newNode);
            last = newNode;
        } else {
            newNode.setNext(last.getNext());
            last.setNext(newNode);
        }

        size++;
    }

    public Node delete() { // last가 가르키는 노드의 다음 노드를 제거
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        Node x = last.getNext();
        if (x == null) {
            last = null;
        } else {
            last.setNext(x.getNext());
            x.setNext(null);
        }

        size--;
        return x;
    }

    private boolean isEmpty() {
        return size == 0;
    }
}

