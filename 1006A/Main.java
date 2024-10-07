class ListNode { /*a single list node*/
    int val; // 103
    ListNode next; // 后面一个元素的位置
    /*construct function*/
    ListNode(int val_) {
        val = val_;
        next = null;
    }
}

class List {
    ListNode head;
    ListNode tail;

    void printList() { /*print the value of the list*/
        ListNode cur = head;
        while (cur != null) {
            System.out.println(cur.val);
            cur = cur.next;
        }
    }

    void addNode(ListNode node) { // O(1)
        if (head == null) {
            head = node;
        } else {
            tail.next = node;
        }
        tail = node;
    }

    // node1 -> node2 -> node  ->  node3-> node4 
    void Insert(ListNode node, int index) {// O(N)
        // index: 添加之后的编号 3
        ListNode cur = head;
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        ListNode originNextNode = cur.next;
        cur.next = node;
        node.next = originNextNode;
    }

    void Remove(int index) {/*remove a fixed position element of listnode*/
        ListNode cur = head;
        for (int i = 0; i < index - 1; i++) {
            cur = cur.next;
        }
        cur.next = cur.next.next;
    }

    boolean isEmpty() {
        if (head == null) {
            return true;
        }
        return false;
    }
}

public class Main {
    public static void main(String[] args) {
        List list = new List();

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node3 = new ListNode(3);
        // node1->node2->node3

        node1.next = node2;
        node2.next = node3;

        list.head = node1;
        list.tail = node3;

        ListNode node4 = new ListNode(4);
        list.addNode(node4);
        list.printList();

    }
}



 
