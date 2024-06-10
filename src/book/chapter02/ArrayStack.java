package book.chapter02;

import java.util.NoSuchElementException;

// 배열로 구현한 스택
public class ArrayStack<E> {

    private E s[];
    private int top;
    public ArrayStack() {
        s = (E[]) new Object[1];
        top = -1;
    }

    public E peek() {
        if (isEmpty()) throw new NoSuchElementException();

        return s[top];
    }

    public void push(E newItem) {
        if (size() == s.length) {
            resize(2*s.length);
        }

        s[++top] = newItem;
    }

    public E pop() {
        if (isEmpty()) throw new NoSuchElementException();

        E item = s[top];
        s[top--] = null;

        if (size() > 0 && size() == s.length/4) {
            resize(s.length/2);
        }

        return item;
    }

    public int size() {return top+1;}
    public boolean isEmpty() {return top == -1;}

    private void resize(int newSize) {
        E[] tmp = (E[]) new Object[newSize];
        for (int i=0; i<s.length; i++) tmp[i] = s[i];
        s = tmp;
    }
}
