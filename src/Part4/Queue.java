package Part4;

import java.util.LinkedList;
import java.util.List;

public class Queue<T> {
    List<T> list = new LinkedList<>();

    public void enqueue(T item){
        list.addLast(item);
    }
    public T dequeue(){
        return list.removeFirst();
    }
    public T peek(){
        return list.getFirst();
    }
    public boolean isEmpty(){
        return list.isEmpty();
    }
    public int size(){
        return list.size();
    }

    @Override
    public String toString(){
        String str = "";
        for (T i : list){
            str = str.concat(i + " ");
        }
        return str;
    }
}
