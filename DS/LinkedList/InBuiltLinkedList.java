package linkedList;

import java.util.LinkedList;

public class InBuiltLinkedList {
    public static void main(String[] args) {

        LinkedList ll = new LinkedList();

        ll.add(2);
        ll.add(22);
        System.out.println(ll.get(1));
        ll.remove(1);
        System.out.println(ll.get(0));

        System.out.println(ll.iterator());
    }
}
