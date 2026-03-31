package Part2;

import java.util.Iterator;

public class LinkedList<T> implements Iterable<T>{

    private Node<T> first;
    private Node<T> last;
    private int size;

    public LinkedList() {
        this.first = null;
        this.last = null;
        this.size = 0;
    }

    ///adds to the end
    public void add(T e){
        if(last != null){
            last.next = new Node<>(last, e, null);
            last = last.next;
        }
        else {
            last = first = new Node<>(null, e, null);
        }
        size++;
    }

    public void add(int i, T e) {
        if (i < 0 || i > size) {
            throw new IndexOutOfBoundsException();
        }
        if (i == 0) {
            addFirst(e);
        } else if (i == size) {
            add(e);
        } else {
            Node<T> current = getNode(i);
            Node<T> newNode = new Node<>(current.prev, e, current);
            current.prev.next = newNode;
            current.prev = newNode;
            size++;
        }
    }

    /// get element value (type T) placed at position i
    public T get(int i){
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        return getNode(i).element;
    }

    /// removes first element equal to e from the list
    public void remove(T e){
        Node<T> current = getNode(e);
        if(current != null){
            removeNode(current);
            size--;
        }
    }

    public void remove(int i) {
        if (i < 0 || i >= size) {
            throw new IndexOutOfBoundsException();
        }
        Node<T> current = getNode(i);
        removeNode(current);
        size--;
    }

    ///- removes all elements equal to e
    public void removeAll(T e){
        Node<T> current;
        while((current = getNode(e)) != null){
            removeNode(current);
            size--;
        }
    }

    public void addFirst(T element) {
        Node<T> newNode = new Node<>(null, element, first);
        if (first == null) {
            first = newNode;
            last = newNode;
        } else {
            first.prev = newNode;
            first = newNode;
        }
        ++size;
    }

    public int getSize(){
        return size;
    }

    ///- returns String representation of the list elements
    public String toString(){
        String str = "List("+size+"): ";
        for (T e : this){
            str = str.concat(e.toString()+", ");
        }
        return str;
    }

    private Node<T> getNode(int index) {
        if (index < size / 2) {
            Node<T> current = first;
            for (int i = 0; i < index; i++) {
                current = current.next;
            }
            return current;
        } else {
            Node<T> current = last;
            for (int i = size - 1; i > index; i--) {
                current = current.prev;
            }
            return current;
        }
    }

    private Node<T> getNode(T e) {

        Node<T> current = first;
        while (current != null) {
            if(current.element == e){ return current; }
            current = current.next;
        }
        return null;
    }


    private void removeNode(Node<T> n){
        if(n.prev == null && n.next == null){
            first = last = null;
        }
        else if(n.prev == null){
            first = first.next;
            first.prev = null;
        } else if (n.next == null) {
            last = last.prev;
            last.next = null;
        }
        else {
            n.prev.next = n.next;
            n.next.prev = n.prev;
        }
    }


    private static class Node<T>{
        Node<T> prev;
        Node<T> next;
        T element;

        Node(Node<T> prev, T element, Node<T> next) {
            this.prev = prev;
            this.next = next;
            this.element = element;
        }
    }

    private class ListIterator implements Iterator<T>{
        Node<T> current = first;

        @Override
        public boolean hasNext() {
            return current != null;
        }

        @Override
        public T next() {
            T data = current.element;
            current = current.next;
            return data;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new ListIterator();
    }
}
