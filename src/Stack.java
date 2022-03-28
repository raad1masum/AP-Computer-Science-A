package src;

import java.util.ArrayList;

public class Stack<T> {
    private ArrayList<T> list = new ArrayList<T>();

    public Stack() {
    }

    public void add(T info) {
        list.add(info);
    }

    public void delete() {
        if (!list.isEmpty())
            list.remove(list.size() - 1);
        else
            System.out.println("null");
    }

    public T peak() {
        if (!list.isEmpty())
            return list.get(list.size() - 1);
        else
            return null;
    }

    public T pop() {
        if (!list.isEmpty()) {
            T out = list.get(list.size() - 1);
            list.remove(list.size() - 1);
            return out;
        }
        else
            return null;
    }

    public int length() {
        return list.size();
    }

    public void clear() {
        list.clear();
    }

    public void display() {
        System.out.println(list);
    }

}