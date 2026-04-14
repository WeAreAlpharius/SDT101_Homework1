package Part2;

import java.util.LinkedList;
import java.util.List;

public class Stack<T> {
    List<T> list = new LinkedList<>();

    public void push(T item) {
        list.addLast(item);
    }
    public T pop(){
        return list.removeLast();
    }
    public T peek(){
        return list.getLast();
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
