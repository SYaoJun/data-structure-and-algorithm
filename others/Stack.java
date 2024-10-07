package others;

import java.util.ArrayList;

public class Stack<E> {
    public void push(E element) {
	contents.add(element);
    }
  
    public E pop() {
	int top = contents.size()-1;
	E result = contents.get(top);
	contents.remove(top);
	return result;
    }

    private ArrayList<E> contents = new ArrayList<E>();
}