package others;

import java.util.ArrayList;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World");
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        // Stack O(N)
        // Queue O(N)

        // LinkedList O(N) - 插入和删除都是O(1)， 访问元素是O(N) Java实现

        // List 自己实现的 链表， 用指针连接每个元素

        // Stack 先进后出 FILO      a b c

        // Queue   先进先出 FIFO     a b c 


    }
}