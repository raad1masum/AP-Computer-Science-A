package src;

import java.util.ArrayList;

public class Queue<T> {
    private ArrayList<T> list = new ArrayList<T>();

    public Queue() {
    }

    public void push(T data) {
        list.add(data);
    }

    public void pop() {
        if (!list.isEmpty())
            list.remove(0);
        else
            System.out.println("null");
    }

    public T peak() {
        if (!list.isEmpty())
            return list.get(0);
        else
            return null;
    }

    public ArrayList<T> display() {
        return list;
    }

    public int length() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }
}
